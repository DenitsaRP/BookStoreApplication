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
import com.scalefocus.bookStore.services.IAuthorsService;

public class AuthorsService implements IAuthorsService {

	@Override
	public AuthorsList getAuthorsInBookstore() {
		final ResponseEntity<AuthorsList> response = RestClient.getRestTemplate().exchange(
				ConfigurationsEnum.BOOKSTORE_APP_URI.getValue() + "/authors", HttpMethod.GET, null,
				new ParameterizedTypeReference<AuthorsList>() {
				}, AuthorsList.class);

		return response.getBody();
	}

	@Override
	public AuthorsList getAuthorById(Long id) {
		final ResponseEntity<Authors> response = RestClient.getRestTemplate()
				.getForEntity(ConfigurationsEnum.BOOKSTORE_APP_URI.getValue() + "/authors/" + id, Authors.class);

		final List<Authors> listAuthors = new ArrayList<Authors>();
		listAuthors.add(response.getBody());

		return AuthorsList.builder().listAuthors(listAuthors).build();
	}

	@Override
	public Authors addAuthors(Authors author) {
		final ResponseEntity<Authors> responseEntity = RestClient.getRestTemplate().postForEntity(
				ConfigurationsEnum.BOOKSTORE_APP_URI.getValue() + "/authors/addAuthor", null, Authors.class);
		return responseEntity.getBody();
	}

//	@Override
//	public List<Authors> getBooksInBookstore() {
//
//		final String fooResourceUrl = ApplicationUri.BOOKS_URI + "/233";
//		final ResponseEntity<Authors> response = RestClient.getRestTemplate().getForEntity(fooResourceUrl,
//				Authors.class);
//		System.out.println(response);
//		response.getBody();
//		final List<Authors> authorsList = new ArrayList<Authors>();
//		authorsList.add(response.getBody());
//
//		return authorsList;
//	}

}
