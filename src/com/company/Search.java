package com.company;

import java.util.List;

public class Search {

    private int linearCounter;
    static int binaryCounter;

    public void linear(String searchTerm, List<String> words) {

        for (int i = 0; i < words.size(); i++){

            if (words.get(i).equals(searchTerm)){
                System.out.println("Word found using Linear Search " + searchTerm);
                System.out.println("It took " + linearCounter + " tries to find the word.");
            }

            else {
                linearCounter++;
            }
        }
    }

    public void binary (String searchTerm, List<String> words){

        int listSize = words.size();
        int halfOfListSize = listSize/2;
        String wordInMiddleOfList = words.get(halfOfListSize);

        if(searchTerm.equals(wordInMiddleOfList)){
            System.out.println("Word found using Binary Search " + searchTerm);
            System.out.println("It took " + binaryCounter + " tries to find the word.");
        }

        if (searchTerm.compareTo(wordInMiddleOfList) < 0){ // is the term in the first half of the list?
            binaryCounter++;
            binary(searchTerm,words.subList(0,halfOfListSize));

        }

        if (searchTerm.compareTo(wordInMiddleOfList) > 0){ //is the term in the second half of the list?
            binaryCounter++;
            binary(searchTerm,words.subList(halfOfListSize,listSize));
        }
    }

}
