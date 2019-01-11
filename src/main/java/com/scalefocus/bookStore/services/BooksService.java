package com.scalefocus.bookStore.services;

import java.util.List;

import com.scalefocus.bookStore.daos.AbstractDao;
import com.scalefocus.bookStore.daos.BooksDao;
import com.scalefocus.bookStore.models.Books;

// TODO
public class BooksService {

	public List<Books> getAllBooksInBookStore() throws Exception {
		final BooksDao booksDao = getBooksDao();
		return booksDao.getAllBooks();
	}

	public Books getBookById(Integer id) throws Exception {
		final BooksDao booksDao = getBooksDao();

		return booksDao.getBookById(id);
	}

	private BooksDao getBooksDao() {
		BooksDao booksDao = null;
		try {
			booksDao = AbstractDao.getDao(BooksDao.class);
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return booksDao;
	}
}
