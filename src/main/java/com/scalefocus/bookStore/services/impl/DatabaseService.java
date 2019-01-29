package com.scalefocus.bookStore.services.impl;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.scalefocus.bookStore.services.IDatabaseService;

public class DatabaseService implements IDatabaseService {
	private static volatile DatabaseService databaseService = null;
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	private DatabaseService() {

	}

	private DatabaseService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public static DatabaseService getInstance() {
		if (databaseService == null) {
			synchronized (DatabaseService.class) {
				if (databaseService == null) {
					final JdbcTemplate jdbcTemplate = getJdbcTemplateInstance();
					databaseService = new DatabaseService(jdbcTemplate);
				}
			}
		}
		return databaseService;

	}

	private static JdbcTemplate getJdbcTemplateInstance() {
		InitialContext initialContext = null;
		JdbcTemplate jdbcTemplate = null;
		try {
			initialContext = new InitialContext();
			jdbcTemplate = new JdbcTemplate((DataSource) initialContext.lookup("java:/comp/env/jdbc/bookstore"));

		} catch (final Exception e) {
			e.printStackTrace();
		}
		return jdbcTemplate;
	}

}
