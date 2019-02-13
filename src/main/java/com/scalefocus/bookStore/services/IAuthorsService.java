package com.scalefocus.bookStore.services;

import com.scalefocus.bookStore.models.Authors;
import com.scalefocus.bookStore.models.AuthorsList;

public interface IAuthorsService {

	AuthorsList getAuthorsInBookstore();

	AuthorsList getAuthorById(Long id);

	Authors addAuthors(Authors author);

}
