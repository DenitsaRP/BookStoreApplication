package com.scalefocus.bookStore.services;

import java.util.ArrayList;
import java.util.List;

import com.scalefocus.bookStore.daos.AbstractDao;
import com.scalefocus.bookStore.daos.BooksDao;
import com.scalefocus.bookStore.models.Books;

public class BooksService {

	public List<Books> getAllBooksInBookStore() {
		final BooksDao booksDao = getBooksDao();
		return new ArrayList<Books>();
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booksDao;
	}
}
