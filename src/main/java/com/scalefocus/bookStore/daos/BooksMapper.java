package com.scalefocus.bookStore.daos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scalefocus.bookStore.models.Books;

public class BooksMapper implements RowMapper<Books> {

	@Override
	public Books mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		final Books book = new Books();
		book.setId(resultSet.getInt("id"));
		book.setName(resultSet.getString("name"));
		book.setAuthorId(resultSet.getInt("authorId"));
		book.setDescription(resultSet.getString("description"));

		try {
			book.setAuthorName(getAuthorDao().getAuthorNameByBookId(book.getId()));
		} catch (final Exception e) {
			e.printStackTrace();
		}

		return book;
	}

	private AuthorDao getAuthorDao() throws Exception {
		final AuthorDao authorDao = AbstractDao.getDao(AuthorDao.class);
		return authorDao;
	}

}
