package com.scalefocus.bookStore.services;

import com.scalefocus.bookStore.models.Authors;
import com.scalefocus.bookStore.models.AuthorsList;
import com.scalefocus.bookStore.models.Books;
import com.scalefocus.bookStore.models.BooksList;

public interface IBooksService {

	Books setBookAuthor(Long bookId, Authors author);

	BooksList getBookById(Long id);

	BooksList getAllBooksInBookstore();

	Books addBooks(Books book);

	AuthorsList getAuthorByBookId(Long bookId);

}
