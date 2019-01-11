package com.scalefocus.bookStore.services;

import java.util.List;

import com.scalefocus.bookStore.models.Books;

public interface IBookService {

	List<Books> getAllBooksInBookStore() throws Exception;

	Books getBookById(Integer id) throws Exception;

}
