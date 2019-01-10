package com.scalefocus.bookStore.validation;

import java.util.InputMismatchException;

public class IdInput {

	public static int checkId(int id) {
		try {
			if(id == (int)id) {
			return id;
			}

		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Input book id is not an integer");
		}
		return id;
	}

}
