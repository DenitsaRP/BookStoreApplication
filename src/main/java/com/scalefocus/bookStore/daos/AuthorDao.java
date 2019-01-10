package com.scalefocus.bookStore.daos;

import java.sql.Connection;
import java.sql.ResultSet;

import com.scalefocus.bookStore.models.Author;
import com.scalefocus.bookStore.services.DatabaseService;

public class AuthorDao extends AbstractDao {

	public Author getAuthor(Integer id) {

		final Author author = new Author();

		try {
			final Connection connection = DatabaseService.getDatabaseConnection();
			final ResultSet resultSet = connection.createStatement().executeQuery(
					"select * from bookstore.books join bookstore.author on b.authorId = a.Id where b.id= " + id);
			if (resultSet.next()) {
				author.setId(resultSet.getInt("id"));
				author.setName(resultSet.getString("name"));
				author.setDescription(resultSet.getString("description"));
			}

		} catch (final Exception e) {
			e.printStackTrace();
		}

		return author;
	}

	public String getAuthorNameById(Integer id) throws Exception {
		String authorName = "";
		final Connection connection = DatabaseService.getDatabaseConnection();
		final ResultSet resultSet = connection.createStatement()
				.executeQuery("select name from author, where id =" + id);
		if (resultSet.next()) {
			authorName = resultSet.getString("name");
		}
		return authorName;
	}
}
