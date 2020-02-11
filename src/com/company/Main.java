package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("/Users/lkirkwoo/Documents/Training/Searching/words.txt"));

//        Scanner searchingFor = new Scanner(System.in);
//        System.out.println("Enter word");
//
//        String word = searchingFor.nextLine();
//        System.out.println("Your search term is " + word);

        Random random = new Random();
        String word = lines.get(random.nextInt(lines.size()));

        Search search  = new Search();

        search.linear(word,lines);
        search.binary(word,lines);
    }
}
