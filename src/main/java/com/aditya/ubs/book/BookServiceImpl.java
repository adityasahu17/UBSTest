package com.aditya.ubs.book;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.aditya.ubs.Constants.ReaderConstants;
import com.aditya.ubs.readerUtility.MapUtil;
/*
 * Service Class
 * */
public class BookServiceImpl implements BookService {

	/*
	 * @Param sentence taking as input and storing keys and value in map
	 * 
	 * @Return map 
	 * */
	public Map<String, Integer> getWordsWithCount(String sentence) {
		Map<String,Integer> words = new HashMap<>();
		String sentenceWithoutDelimeter = sentence.toLowerCase().replaceAll(ReaderConstants.REGEX, " ");// REGEX constant can be changed according to the requirement
		String[] wordArray = sentenceWithoutDelimeter.split(" +");
		for(String word:wordArray){
			if(words.containsKey(word)){
				words.put(word, words.get(word)+1);
			}else{
				words.put(word, 1);
			}
		}
		Map<String, Integer> sortedWords = MapUtil.sortByValue(words);
		return sortedWords;
	}
	
	/*
	 * @Param sortedWords printing the words with occurrence
	 * */
	public void printWordsWithCount(Map<String,Integer> sortedWords) {
		if(!sortedWords.isEmpty()){
			for (Entry<String, Integer> entry : sortedWords.entrySet()) {
				System.out.println(entry.getKey() + " - " + entry.getValue());
			}
		}else{
			System.out.println("printWordsWithCount got an empty map");
		}
	}
	
	/*
	 * @Param sentence input string to validate 
	 * 	
	 * */
	public boolean validateInput(String sentence){
		if(sentence.length()>=ReaderConstants.MIN_LENGTH_SENTENCE){ // MIN_LENGTH_SENTENCE is constant can be changed according to the validation required by the client
			return true;
		}
		return false;	
	}

	@Override
	public void printLongestWord(String sentence) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printVowels(String sentence) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printNumberOfWords(String sentence) {
		// TODO Auto-generated method stub
		
	}

}
