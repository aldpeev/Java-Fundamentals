package L11_Regex.Exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] participantsArr = scanner.nextLine().split(", ");
        Map<String, Integer> raceMap = new HashMap<>();

        Pattern patternName = Pattern.compile("[A-Za-z]");
        Pattern patternKilometers = Pattern.compile("\\d");

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            Matcher matchName = patternName.matcher(input);
            Matcher matchKilometers = patternKilometers.matcher(input);

            String name = "";
            while (matchName.find()) {
                name += matchName.group();
            }

            int kilometers = 0;
            while (matchKilometers.find()) {
                kilometers += Integer.parseInt(matchKilometers.group());
            }

            for (String el : participantsArr) {
                if (el.equals(name)) {
                    if (!raceMap.containsKey(name)) {
                        raceMap.put(name, kilometers);
                    } else {
                        raceMap.put(name, raceMap.get(name) + kilometers);
                    }
                }
            }
            input = scanner.nextLine();
        }

        List<String> winnersList = raceMap.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).limit(3).map(e -> e.getKey()).collect(Collectors.toList());

        System.out.printf("1st place: %s%n", winnersList.get(0));
        System.out.printf("2nd place: %s%n", winnersList.get(1));
        System.out.printf("3rd place: %s%n", winnersList.get(2));

    }
}
