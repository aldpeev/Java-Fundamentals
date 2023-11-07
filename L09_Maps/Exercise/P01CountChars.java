package L09_Maps.Exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = scanner.nextLine().split("");
        Map<String, Integer> countChars = new LinkedHashMap<>();

        for (String el : strArr){
            if (!el.equals(" ")){
                Integer currentCount = countChars.get(el);
                if (currentCount == null){
                    countChars.put(el,1);
                } else {
                    countChars.put(el, countChars.get(el) + 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : countChars.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
