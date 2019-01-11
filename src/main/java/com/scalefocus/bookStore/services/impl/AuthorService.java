package com.scalefocus.bookStore.services.impl;

import java.util.List;

import com.scalefocus.bookStore.daos.AbstractDao;
import com.scalefocus.bookStore.daos.AuthorDao;
import com.scalefocus.bookStore.models.Authors;
import com.scalefocus.bookStore.services.IAuthorService;

public class AuthorService implements IAuthorService {

	@Override
	public List<Authors> getAuthorsInBookstore() throws Exception {
		final AuthorDao authorDao = AbstractDao.getDao(AuthorDao.class);
		return authorDao.getAllAuthors();
	}

}
