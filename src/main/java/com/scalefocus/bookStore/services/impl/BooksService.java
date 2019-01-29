package com.scalefocus.bookStore.services.impl;

import java.util.List;

import com.scalefocus.bookStore.daos.AbstractDao;
import com.scalefocus.bookStore.daos.BooksDao;
import com.scalefocus.bookStore.models.Books;
import com.scalefocus.bookStore.services.IBookService;

public class BooksService implements IBookService {

	@Override
	public List<Books> getAllBooksInBookStore() throws Exception {
		final BooksDao booksDao = getBooksDao();
		return booksDao.getListOfAllBooks();
	}

//	@Override
//	public Books getBookById(Integer id) throws Exception {
//		final BooksDao booksDao = getBooksDao();
//
//		return booksDao.getBookById(id);
//	}

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
