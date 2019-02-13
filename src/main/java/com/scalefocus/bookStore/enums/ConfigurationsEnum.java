package com.scalefocus.bookStore.enums;

public enum ConfigurationsEnum {

	BOOKSTORE_APP_URI("http://localhost:8085/bookApp");

	private final String value;

	ConfigurationsEnum(String uri) {
		this.value = uri;
	}

	public String getValue() {
		return this.value;
	}

}
