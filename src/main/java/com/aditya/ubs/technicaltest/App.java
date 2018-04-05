package com.aditya.ubs.technicaltest;

import java.io.IOException;
import java.util.Map;

import com.aditya.ubs.Constants.ReaderConstants;
import com.aditya.ubs.book.BookService;
import com.aditya.ubs.book.BookServiceImpl;
import com.aditya.ubs.readerUtility.ReaderFactory;
/*
 * Entry point for Application
 * We need to ask the ReaderFactory to get the specific reader.
 * ReaderFactory is a utility class which enable the different input types, here I have only
 * demonstrated the Console input.With this factory design pattern we can further write our 
 * code with different input type.
 * 
 *
 * */
public class App 
{
    public static void main( String[] args )
    {
    	BookService book = new BookServiceImpl();
    	try {
			String sentence = ReaderFactory.getReader(ReaderConstants.CONSOLE_INPUT).read();// For this test I have demonstrated and initialised console input object from factory
			String sentenceXML = ReaderFactory.getReader(ReaderConstants.XML_INPUT).read();// It could be easily integrated with the XML input via webservices or with text or pdf files
			if(book.validateInput(sentence)){
				Map<String,Integer> words = book.getWordsWithCount(sentence);
				book.printWordsWithCount(words);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
