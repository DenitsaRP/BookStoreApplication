package com.scalefocus.bookStore.daos;

public abstract class AbstractDao {

//	private static JdbcTemplate jdbcTemplate;
//	static {
//		try {
//			jdbcTemplate = DatabaseService.getInstance().getJdbcTemplate();
//		} catch (final Exception e) {
//			e.printStackTrace();
//		}
//	}

	public static <T> T getDao(Class<?> clazz) throws Exception {
		if (AuthorDao.class.equals(clazz)) {
			return (T) new AuthorDao();
		}
		if (BooksDao.class.equals(clazz)) {
			return (T) new BooksDao();
		}
		throw new Exception("Dao Not found!");
	}

//	public static JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
}
