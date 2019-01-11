package com.scalefocus.bookStore.services.impl;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.scalefocus.bookStore.services.IDatabaseService;

public class DatabaseService implements IDatabaseService {

	public static Connection getDatabaseConnection() throws Exception {
		final InitialContext initialContext = new InitialContext();
		final DataSource dataSource = (DataSource) initialContext.lookup("java:/comp/env/jdbc/bookstore");
		return dataSource.getConnection();
	}
}
