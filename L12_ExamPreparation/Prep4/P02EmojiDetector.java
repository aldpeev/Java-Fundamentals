package L12_ExamPreparation.Prep4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern patternEmoji = Pattern.compile("([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})\\1");
        Pattern patternNumbers = Pattern.compile("\\d");

        int threshold = 1;
        int foundEmojis = 0;
        List<String> coolEmojis = new ArrayList<>();

        Matcher m = patternNumbers.matcher(input);
        while (m.find()) {
            threshold *= Integer.parseInt(m.group());
        }

        Matcher m1 = patternEmoji.matcher(input);
        while (m1.find()) {
            foundEmojis++;
            String textEmoji = m1.group("emoji");
            String allMatch = m1.group();

            int emojiSum = 0;
            for (char el : textEmoji.toCharArray()) {
                emojiSum += el;
            }

            if (emojiSum >= threshold) {
                coolEmojis.add(allMatch);
            }

        }

        System.out.printf("Cool threshold: %d%n", threshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", foundEmojis);
        System.out.println(String.join(System.lineSeparator(), coolEmojis));

    }
}
