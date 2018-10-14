package com.racecraftr.font;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        do {
            line = reader.readLine();
//            line = line.toUpperCase();
            char[] lineChars = line.toCharArray();
            for (int i = 0; i < Letter.ROWS; i++) {
                StringBuilder row = new StringBuilder();
                for (Character c : lineChars) {
                    Letter letter = Letter.LETTER_MAP.get(c);
                    row.append(letter.getRow(i));
                }
                System.out.println(row.toString());
            }
        } while (!"EXIT".equals(line));

    }
}