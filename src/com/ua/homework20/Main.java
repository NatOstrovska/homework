package com.ua.homework20;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();

        map.put("яблуко", List.of("apple", "りんご", "Apfel"));
        map.put("банан", List.of("banana", "バナナ", "Banane"));
        map.put("груша", List.of("pear", "梨", "Birne"));
        map.put("слива", List.of("plum", "梅", "Pflaume"));
        map.put("вишня", List.of("cherry", "チェリー", "Kirsche"));
        map.put("малина", List.of("raspberry", "ラズベリー", "Himbeere"));
        map.put("лимон", List.of("lemon", "レモン", "Zitrone"));
        map.put("смородина", List.of("currant", "スグリ", "Johannisbeere"));
        map.put("апельсин", List.of("orange", "オレンジ", " Orange"));
        map.put("абрикос", List.of("apricot", "アプリコット", "Aprikose"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = scanner.nextLine();

        if (map.containsKey(word)) {
            System.out.println(map.get(word));
        } else {
            System.out.println("The word entered not found in my distionary");
        }

    }
}
