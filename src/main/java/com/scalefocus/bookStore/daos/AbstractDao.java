package com.scalefocus.bookStore.daos;

public abstract class AbstractDao {

	public static <T> T getDao(Class<?> clazz) throws Exception {
		if (AuthorDao.class.equals(clazz)) {
			return (T) new AuthorDao();
		}
		if (BooksDao.class.equals(clazz)) {
			return (T) new BooksDao();
		}
		throw new Exception("Dao Not found!");
	}
}
