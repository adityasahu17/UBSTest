package com.aditya.ubs.book;


import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class BookServiceTest {
	
	@Test
	public void getWordsWithCount(){
		BookServiceImpl book = new BookServiceImpl();
		Map<String,Integer> actualMap = book.getWordsWithCount("This is a statement, and so is this.");
		Map<String, Integer> words = new HashMap<>();
		words.put("this", 2);
		words.put("is",2);
		words.put("a", 1);
		words.put("statement", 1);
		words.put("and", 1);
		words.put("so", 1);
		assertEquals("Key/Value mismach for Map",words, actualMap);
		assertNotNull("Received Map is null", words);
		
	}
	
	@Test
	public void validateInput(){
		BookServiceImpl book = new BookServiceImpl();
		boolean output = book.validateInput("Ad");
		boolean valid = false;
		assertEquals(valid, output);
		
	}
	
	@Test
	public void validateNullInput(){
		BookServiceImpl book = new BookServiceImpl();
		boolean output = book.validateInput("");
		boolean valid = false;
		assertEquals(valid, output);
		
	}


}
