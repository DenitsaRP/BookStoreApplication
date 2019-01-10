package com.scalefocus.bookStore.services;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DatabaseService {

	public static Connection getDatabaseConnection() throws Exception {
		final InitialContext initialContext = new InitialContext();
		final DataSource dataSource = (DataSource) initialContext.lookup("java:/comp/env/jdbc/bookstore");
		return dataSource.getConnection();
	}
}
