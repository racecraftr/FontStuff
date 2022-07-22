package com.racecraftr.font;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
				String line = null;
        do{
					 line = sc.nextLine();
					 line = line.toUpperCase(Locale.ROOT);
					 char[] lineChars = line.toCharArray();
					 for(int i = 0; i < Letter.ROWS; i++) {
							StringBuilder row = new StringBuilder();
							for(char c : lineChars) {
								 Letter letter = Letter.LETTER_MAP.get(c);
								 row.append(letter.getRow(i));
							}
							System.out.println(row.toString());
					 }
				} while(!"[ESC]".equals(line));
    }
}