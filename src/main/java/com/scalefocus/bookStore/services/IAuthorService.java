package com.scalefocus.bookStore.services;

import java.util.List;

import com.scalefocus.bookStore.models.Authors;

public interface IAuthorService {

	List<Authors> getAuthorsInBookstore() throws Exception;

}
