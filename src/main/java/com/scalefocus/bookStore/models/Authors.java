package com.scalefocus.bookStore.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonDeserialize(as = Authors.class)
public class Authors {

	private Long id;
	private String name;
	private String description;
}
