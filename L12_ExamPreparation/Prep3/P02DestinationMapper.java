package L12_ExamPreparation.Prep3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern p = Pattern.compile("([=\\/])(?<city>[A-Z][A-Za-z]{2,})\\1");
        List<String> destinationList = new ArrayList<>();

        String input = scanner.nextLine();
        Matcher m = p.matcher(input);
        int points = 0;
        while (m.find()){
            StringBuilder sb = new StringBuilder();

            destinationList.add(m.group("city"));
            sb.append(m.group("city"));
            points += sb.length();
        }

        System.out.printf("Destinations: %s%n", String.join(", ", destinationList));
        System.out.printf("Travel Points: %d%n", points);
    }
}
