package L11_Regex.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern p = Pattern.compile("\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b");
        Matcher m = p.matcher(input);

        List<String> phoneNumberList = new ArrayList<>();
        while (m.find()){
            phoneNumberList.add(m.group());
        }

        System.out.println(String.join(", ", phoneNumberList));
    }
}
