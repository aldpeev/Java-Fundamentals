package L10_TextProcessng.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        String input = scanner.nextLine();
        sb.append(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {

            char currentChar = input.charAt(i);
            char prevChar = input.charAt(i -1);

            if (currentChar != prevChar ){
                sb.append(currentChar);
            }
        }

        System.out.println(sb);
    }
}
