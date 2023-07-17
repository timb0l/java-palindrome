package com.palindrome.java;

import java.util.Scanner;

public class JavaPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            Boolean a = true;
            char[] word;
        System.out.println("Type word..");

        word = scan.next().toCharArray();
        int b = word.length -1;

        for (int c = 0; c >= word.length; c ++){
            if (!(word[c] == word[b])){
                a = false;
            } b--;
        }if (a == false){
            System.out.println(word.length + "is not palindrome word.");
        }else
            System.out.println(word.length + "is palindrome word.");
        scan.close();
    }
}
