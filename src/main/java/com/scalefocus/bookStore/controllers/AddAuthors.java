package com.scalefocus.bookStore.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scalefocus.bookStore.models.Authors;
import com.scalefocus.bookStore.services.IAuthorsService;
import com.scalefocus.bookStore.services.impl.AuthorsService;

@WebServlet("/authors/add")
public class AddAuthors extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final IAuthorsService authorsService = new AuthorsService();
		final Authors author = new Authors();
		author.setName(request.getParameter("name"));
		author.setDescription(request.getParameter("description"));
		request.setAttribute("author", authorsService.addAuthors(author));
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final IAuthorsService authorsService = new AuthorsService();
		request.setAttribute("Authors", authorsService.getAuthorsInBookstore());
		final RequestDispatcher requestDispatcher = request.getRequestDispatcher("AddAuthor.jsp");
		requestDispatcher.forward(request, response);

	}

}
