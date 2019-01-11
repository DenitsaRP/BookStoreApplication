package com.scalefocus.bookStore.daos;

import java.sql.Connection;

import com.scalefocus.bookStore.services.impl.DatabaseService;

public abstract class AbstractDao {

	private static Connection connection;
	static {
		try {
			connection = DatabaseService.getDatabaseConnection();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	public static <T> T getDao(Class<?> clazz) throws Exception {
		if (AuthorDao.class.equals(clazz)) {
			return (T) new AuthorDao();
		}
		if (BooksDao.class.equals(clazz)) {
			return (T) new BooksDao();
		}
		throw new Exception("Dao Not found!");
	}

	public static Connection getDatabaseConnection() {
		return connection;
	}
}
