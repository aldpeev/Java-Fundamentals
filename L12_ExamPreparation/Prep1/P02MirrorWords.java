package L12_ExamPreparation.Prep1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        int count = 0;

        String input = scanner.nextLine();
        Pattern p = Pattern.compile("([@#])(?<first>[A-Za-z]{3,})\\1{2}(?<second>[A-Za-z]{3,})\\1");
        Matcher m = p.matcher(input);

        while (m.find()) {
            String first = m.group("first");
            StringBuilder secondSb = new StringBuilder(m.group("second"));

            if (first.equals(secondSb.reverse().toString())) {
                list.add(first + " <=> " + secondSb.reverse());
            }
            count++;
        }

        if (!list.isEmpty()) {
            System.out.printf("%d word pairs found!%n", count);
            System.out.printf("The mirror words are:%n%s", String.join(", ", list));
        } else {
            if (count > 0) {
                System.out.printf("%d word pairs found!%n", count);
            } else {
                System.out.println("No word pairs found!");
            }
            System.out.println("No mirror words!");
        }


    }
}
