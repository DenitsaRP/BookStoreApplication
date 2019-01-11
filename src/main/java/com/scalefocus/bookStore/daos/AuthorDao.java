package com.scalefocus.bookStore.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.scalefocus.bookStore.models.Authors;

public class AuthorDao extends AbstractDao {

	public Authors getAuthor(Integer id) {

		final Authors author = new Authors();

		try {

			final ResultSet resultSet = getDatabaseConnection().createStatement().executeQuery(
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

	public String getAuthorNameByBookId(Integer id) throws Exception {
		String authorName = null;
		final Connection connection = getDatabaseConnection();
		final ResultSet resultSet = connection.createStatement().executeQuery(
				"select author.name from author inner join books on author.id=books.authorId where books.id = " + id);
		if (resultSet.next()) {
			authorName = resultSet.getString("name");
		}
		return authorName;
	}

	public List<Authors> getAllAuthors() {
		final List<Authors> authors = new ArrayList<Authors>();

		try {
			final Connection connection = getDatabaseConnection();
			final ResultSet resultSet = connection.createStatement().executeQuery("select * from author");
			while (resultSet.next()) {
				final Authors author = new Authors();
				author.setId(resultSet.getInt("Id"));
				author.setName(resultSet.getString("name"));
				author.setDescription(resultSet.getString("description"));
				authors.add(author);

			}
		} catch (final Exception e) {

			e.printStackTrace();
		}
		return authors;
	}
}
