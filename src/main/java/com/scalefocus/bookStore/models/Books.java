package com.scalefocus.bookStore.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonDeserialize(as = Books.class)
public class Books {

	private Long id;
	private Long isbn;
	private String name;
	private Authors author;
	private String description;
}
