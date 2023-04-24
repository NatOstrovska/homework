package com.ua.homework27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) {

        saveStringToFile("Hello world!!", "test.txt");
        System.out.println(readStringFromFile("test.txt"));

    }

    public static void saveStringToFile(String string, String FILE_NAME) {

        OutputStreamWriter output = null;

        try {
            output = new OutputStreamWriter(new FileOutputStream(FILE_NAME));
            output.write(string);

        } catch (IOException e) {
            throw new RuntimeException();

        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static String readStringFromFile(String FILE_NAME) {

        FileInputStream file = null;
        byte[] bytes;
        String string = null;

        try {
            file = new FileInputStream(FILE_NAME);
            bytes = file.readAllBytes();
            string = new String(bytes);

        } catch (IOException e) {
            throw new RuntimeException();

        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return string;
        }
    }

}
