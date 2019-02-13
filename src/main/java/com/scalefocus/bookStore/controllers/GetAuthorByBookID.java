package com.scalefocus.bookStore.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scalefocus.bookStore.services.IBooksService;
import com.scalefocus.bookStore.services.impl.BookService;

@WebServlet("/authorByBookID/*")
public class GetAuthorByBookID extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		final String[] arr = request.getPathInfo().split("/");
		final long aid = Long.valueOf(arr[arr.length - 1]);

		final IBooksService booksService = new BookService();
		request.setAttribute("Authors", booksService.getAuthorByBookId(aid).getListAuthors());
		final RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ShowAuthors.jsp");
		requestDispatcher.forward(request, response);

	}

}
