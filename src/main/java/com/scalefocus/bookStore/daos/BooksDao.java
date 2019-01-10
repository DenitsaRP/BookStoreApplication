package com.scalefocus.bookStore.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.scalefocus.bookStore.models.Books;
import com.scalefocus.bookStore.services.DatabaseService;

public class BooksDao extends AbstractDao {

	public Books getBookById(int id) throws Exception {

		final Books book = new Books();
		final AuthorDao authorDao = AbstractDao.getDao(AuthorDao.class);

		try {
			final Connection connection = DatabaseService.getDatabaseConnection();
			final ResultSet resultSet = connection.createStatement()
					.executeQuery("select * from books where books.authorId = " + id);
			if (resultSet.next()) {
				book.setId(resultSet.getInt("id"));
				book.setName(resultSet.getString("name"));
				book.setAuthorId(resultSet.getInt("authorId"));
				book.setAuthorName(resultSet.getString(authorDao.getAuthorNameById(id)));
				book.setDescription(resultSet.getString("description"));
			}

		} catch (final Exception e) {
			e.printStackTrace();
		}

		return book;
	}

	public List<Books> getAllBooks() {
		final List<Books> books = new ArrayList<Books>();
		final Books book = new Books();

		try {
			final Connection connection = DatabaseService.getDatabaseConnection();
			final ResultSet resultSet = connection.createStatement().executeQuery("select * from books");
			while (resultSet.next()) {
				book.setId(resultSet.getInt("id"));
				book.setName(resultSet.getString("name"));
				book.setAuthorId(resultSet.getInt("authorId"));
				book.setDescription(resultSet.getString("description"));
				books.add(book);
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return books;
	}
}
