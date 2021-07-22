package com.company;


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String userString = input.nextLine();
        userString = userString.replaceAll("[A-Z]", "").toLowerCase();
        int count = 0;


        HashMap<Character, Integer> charCount = new HashMap<>();

        char[] charInString = userString.toCharArray();


        for(char letter : charInString){
            if(charCount.containsKey(letter)){
                charCount.put(letter, charCount.get(letter)+1);
            } else {
                charCount.put(letter,1);
            }
        }
        for(Map.Entry<Character, Integer> printChar: charCount.entrySet()){
            System.out.println(printChar.getKey() + ": " + printChar.getValue());
        }
    }
}
