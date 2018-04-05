package com.aditya.ubs.book;

import java.util.Map;

public interface BookService {
	Map<String,Integer> getWordsWithCount(String sentence);
	void printWordsWithCount(Map<String, Integer> words);
	boolean validateInput(String sentence);
	void printLongestWord(String sentence);
	void printVowels(String sentence);
	void printNumberOfWords(String sentence);
	
}
