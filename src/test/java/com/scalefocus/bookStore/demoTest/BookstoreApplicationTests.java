package com.scalefocus.bookStore.demoTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookstoreApplicationTests {

	@Test
	public void testGetAllBooksListSuccess() {

		// RestTemplate
		// URI
		// ResponseEntity
		// Assert Status code 200
		// Assert result.getBody() contains BookList
	}

	@Test
	public void testGetBookById() {

		// RestTemplate
		// URI
		// ResponseEntity
		// Assert Status code 200
		// Assert result.getBody() contains BookList
	}

	@Test
	public void testGetMessage404() {
		// mockServer

	}

	@Test
	public void testGetMessage500() {

	}

	@Test(expected = NullPointerException.class)
	public void testGetBookByIdNegetive() {
		// Call BookServies
		// getBookById(id)
		// fail()expected

	}

	@Test
	public void addBookSuccessfully() {

	}

}
