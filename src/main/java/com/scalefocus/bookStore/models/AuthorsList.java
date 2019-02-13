package com.scalefocus.bookStore.models;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonDeserialize(as = AuthorsList.class)
@Builder
public class AuthorsList {

	private List<Authors> listAuthors;

}
