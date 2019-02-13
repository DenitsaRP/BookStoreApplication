package com.scalefocus.bookStore.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scalefocus.bookStore.models.AuthorsList;
import com.scalefocus.bookStore.services.IAuthorsService;
import com.scalefocus.bookStore.services.impl.AuthorsService;

@WebServlet("/authors/all")
public class ViewAuthors extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final IAuthorsService authorsService = new AuthorsService();
		final AuthorsList authorsList = authorsService.getAuthorsInBookstore();
		request.setAttribute("Authors", authorsList.getListAuthors());
		final RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ShowAuthors.jsp");
		requestDispatcher.forward(request, response);

	}

}
