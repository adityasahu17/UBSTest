package com.aditya.ubs.readerUtility;

import java.io.IOException;
import java.util.Scanner;

/*
 * Utility class for initializing console input
 * */
public class ConsoleReader implements Reader {

	public String read() throws IOException {
		System.out.println("Start typing your sentence: ");
		Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        return line;
	}

}
