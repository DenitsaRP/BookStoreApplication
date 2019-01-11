package com.scalefocus.bookStore.services;

import java.util.List;

import com.scalefocus.bookStore.daos.AbstractDao;
import com.scalefocus.bookStore.daos.AuthorDao;
import com.scalefocus.bookStore.models.Authors;

public class AuthorService {

	public List<Authors> getAuthorsInBookstore() throws Exception {
		final AuthorDao authorDao = AbstractDao.getDao(AuthorDao.class);
		return authorDao.getAllAuthors();
	}

}
