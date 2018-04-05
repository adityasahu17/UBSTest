package com.aditya.ubs.readerUtility;

import com.aditya.ubs.Constants.ReaderConstants;

/*
 * Factory class for initialize objects according to input
 * */
public class ReaderFactory {
	
	public static Reader getReader(String readerType) {
		 Reader reader = null;
		 if (readerType.equalsIgnoreCase(ReaderConstants.CONSOLE_INPUT)) {
		     reader = new ConsoleReader();
		 } else if (readerType.equalsIgnoreCase(ReaderConstants.TEXTFILE_INPUT)) {
		     reader = new FileReader();
		 } else if (readerType.equalsIgnoreCase(ReaderConstants.XML_INPUT)) {
		     reader = new XMLReader();
		 }
		 return reader;
		 }

}
