package com.scalefocus.bookStore.daos;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.scalefocus.bookStore.models.Books;
import com.scalefocus.bookStore.services.impl.DatabaseService;

public class BooksDao extends AbstractDao {

	public List<Books> getListOfAllBooks() {
		final JdbcTemplate jdbcTemplate = DatabaseService.getInstance().getJdbcTemplate();
		final List<Books> listOfBooks = jdbcTemplate.query("SELECT * FROM books", new BooksMapper());
		return listOfBooks;
	}

}
