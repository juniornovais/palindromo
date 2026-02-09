package com.palindromo;

import com.palindromo.stack.CharStack;

public class Main {
    public static void main(String[] args) {
        CharStack charStack = new CharStack();
        String name = "Roma é amor";

        String palindromeVerified = name.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        

        for (int i = 0; i < palindromeVerified.length(); i++) {
            char verified = palindromeVerified.charAt(i);
            
            charStack.push(verified);
        }
        String inverted = "";


        while (!charStack.isEmpty()) {
            inverted += charStack.pop();
        }

        if (palindromeVerified.equals(inverted)) {
            System.out.println(inverted);
            System.out.println(palindromeVerified);
            System.out.println("This is a palindrome.\n ");
        }
        else {
            System.out.println(inverted);
            System.out.println(palindromeVerified);
            System.out.println("This is not a palindrome. \n");
        }

    }
}