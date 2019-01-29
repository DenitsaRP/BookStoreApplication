package com.scalefocus.bookStore.daos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scalefocus.bookStore.models.Authors;

public class AuthorsMapper implements RowMapper<Authors> {

	@Override
	public Authors mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		final Authors authors = new Authors();
		authors.setId(resultSet.getInt("id"));
		authors.setName(resultSet.getString("name"));
		authors.setDescription(resultSet.getString("description"));
		return authors;
	}

}
