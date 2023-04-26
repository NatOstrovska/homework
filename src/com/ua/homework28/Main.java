package com.ua.homework28;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        saveStringToFile("Hello World!!!", "test1.txt");
        System.out.println(readStringFromFile("test1.txt"));
    }

    public static void saveStringToFile(String string, String FILE_NAME) {

        Path path = Paths.get(FILE_NAME);

        try {
            Files.createFile(path);
            Files.writeString(path, string);

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public static String readStringFromFile(String FILE_NAME) {

        String string = null;

        try {
            Path path = Path.of(FILE_NAME);
            string = Files.readString(path);
            return string;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
