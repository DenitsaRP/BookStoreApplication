package com.scalefocus.bookStore.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.scalefocus.bookStore.models.Books;

public class BooksDao extends AbstractDao {

	public Books getBookById(int id) throws Exception {

		final Books book = new Books();
		final AuthorDao authorDao = getAuthorDao();

		try {
			final Connection connection = getDatabaseConnection();
			final ResultSet resultSet = connection.createStatement().executeQuery(
					"select b.id, b.name, b.authorId, b.description, a.name  from books b join author a on b.authorId = a.Id where b.id= "
							+ id);
			if (resultSet.next()) {
				book.setId(resultSet.getInt("id"));
				book.setName(resultSet.getString("name"));
				book.setAuthorId(resultSet.getInt("authorId"));
				book.setDescription(resultSet.getString("description"));
				final String authorName = authorDao.getAuthorNameByBookId(id);
				book.setAuthorName(authorName);
			}

		} catch (final Exception e) {
			e.printStackTrace();
		}

		return book;
	}

	public List<Books> getAllBooks() {
		final List<Books> books = new ArrayList<Books>();

		try {
			final Connection connection = getDatabaseConnection();
			final ResultSet resultSet = connection.createStatement().executeQuery("select * from books");
			while (resultSet.next()) {
				final Books book = new Books();
				book.setId(resultSet.getInt("id"));
				book.setName(resultSet.getString("name"));
				book.setAuthorId(resultSet.getInt("authorId"));
				book.setDescription(resultSet.getString("description"));
				book.setAuthorName(getAuthorDao().getAuthorNameByBookId(book.getId()));
				books.add(book);

			}
		} catch (final Exception e) {

			e.printStackTrace();
		}
		return books;
	}

	private AuthorDao getAuthorDao() throws Exception {
		final AuthorDao authorDao = AbstractDao.getDao(AuthorDao.class);
		return authorDao;
	}

}
