package com.scalefocus.bookStore.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scalefocus.bookStore.services.IBookService;
import com.scalefocus.bookStore.services.impl.BooksService;

public class GetBooks extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final int id = Integer.parseInt(request.getParameter("id"));
		final IBookService booksService = new BooksService();
		try {
			request.setAttribute("Books", booksService.getBookById(id));
		} catch (final Exception e) {
			throw new ServletException("Book not FOUND!");
		}
		final RequestDispatcher requestDispatcher = request.getRequestDispatcher("ShowBooks.jsp");

		requestDispatcher.forward(request, response);

	}

}
