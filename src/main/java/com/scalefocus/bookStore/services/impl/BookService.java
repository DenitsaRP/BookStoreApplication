package com.scalefocus.bookStore.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.scalefocus.bookStore.enums.ConfigurationsEnum;
import com.scalefocus.bookStore.http.clients.RestClient;
import com.scalefocus.bookStore.models.Authors;
import com.scalefocus.bookStore.models.AuthorsList;
import com.scalefocus.bookStore.models.Books;
import com.scalefocus.bookStore.models.BooksList;
import com.scalefocus.bookStore.services.IBooksService;

public class BookService implements IBooksService {

	@Override
	public BooksList getAllBooksInBookstore() {

		final ResponseEntity<BooksList> response = RestClient.getRestTemplate().exchange(
				ConfigurationsEnum.BOOKSTORE_APP_URI.getValue() + "/books", HttpMethod.GET, null,
				new ParameterizedTypeReference<BooksList>() {
				}, BooksList.class);

		return response.getBody();
	}

	@Override
	public BooksList getBookById(Long id) {
		final ResponseEntity<Books> response = RestClient.getRestTemplate()
				.getForEntity(ConfigurationsEnum.BOOKSTORE_APP_URI.getValue() + "/books/" + id, Books.class);
		final List<Books> bookList = new ArrayList<Books>();
		bookList.add(response.getBody());
		return BooksList.builder().listBooks(bookList).build();
	}

	@Override
	public AuthorsList getAuthorByBookId(Long bookId) {
		final ResponseEntity<Authors> responseEntity = RestClient.getRestTemplate().getForEntity(
				ConfigurationsEnum.BOOKSTORE_APP_URI.getValue() + "/books/authorByBook/" + bookId, Authors.class);
		final List<Authors> authorsList = new ArrayList<Authors>();
		authorsList.add(responseEntity.getBody());
		return AuthorsList.builder().listAuthors(authorsList).build();
	}

	@Override
	public Books setBookAuthor(Long bookId, Authors author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Books addBooks(Books book) {
		// TODO Auto-generated method stub
		return null;
	}

}

//	@Override
//	public List<Books> getBooksInBookstore() {
//
//		final ResponseEntity<List<Books>> response = RestClient.getRestTemplate().exchange(
//				ApplicationUri.BOOKS_URI.getUri(), HttpMethod.GET, null, new ParameterizedTypeReference<List<Books>>() {
//				}, Books.class);
//
//		List<Books> bookList = new ArrayList<Books>();
//		bookList = response.getBody();
//		return bookList;
//	}
//}
