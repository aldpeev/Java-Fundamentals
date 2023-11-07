package L04_Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        vowelsCount(scanner.nextLine());
    }

    public static void vowelsCount ( String text){

        int vowels = 0;

        String textToLowercase = text.toLowerCase();

        String[] arr = textToLowercase.split("");

        for (String el : arr) {
            if (el.equals("a") || el.equals("e") || el.equals("i") || el.equals("o") || el.equals("u")){
                vowels ++;
            }
        }

        System.out.println(vowels);
    }
}
