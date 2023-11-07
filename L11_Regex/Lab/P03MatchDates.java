package L11_Regex.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern p = Pattern.compile("\\b(?<day>\\d{2})([.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b");
        Matcher m = p.matcher(input);

        while (m.find()){
            System.out.printf("Day: %s, Month: %s, Year: %s%n",m.group("day"),m.group("month"),m.group("year"));
        }
    }
}
