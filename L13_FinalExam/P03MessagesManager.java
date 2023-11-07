package L13_FinalExam;

import java.util.*;

public class P03MessagesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> map = new LinkedHashMap<>();

        int maxMessages = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Statistics")) {
            String[] commandLine = command.split("=");
            switch (commandLine[0]) {
                case "Add":
                    if (!map.containsKey(commandLine[1])) {
                        map.put(commandLine[1], new ArrayList<>());
                        map.get(commandLine[1]).add(Integer.parseInt(commandLine[2]));
                        map.get(commandLine[1]).add(Integer.parseInt(commandLine[3]));
                    }
                    break;
                case "Message":
                    if (map.get(commandLine[1]) != null && map.get(commandLine[2]) != null) {
                        map.get(commandLine[1]).set(0, map.get(commandLine[1]).get(0) + 1);
                        map.get(commandLine[2]).set(1, map.get(commandLine[2]).get(1) + 1);

                        if (map.get(commandLine[1]).get(0) + map.get(commandLine[1]).get(1) >= maxMessages) {
                            map.remove(commandLine[1]);
                            System.out.printf("%s reached the capacity!%n", commandLine[1]);
                        }

                        if (map.get(commandLine[2]).get(1) + map.get(commandLine[2]).get(0) >= maxMessages) {
                            map.remove(commandLine[2]);
                            System.out.printf("%s reached the capacity!%n", commandLine[2]);
                        }
                    }

                    break;
                case "Empty":
                    if (map.get(commandLine[1]) != null) {
                        map.remove(commandLine[1]);
                    } else if (commandLine[1].equals("All")) {
                        map.clear();
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Users count: %d%n", map.size());
        map.entrySet().stream().forEach(e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue().get(0) + e.getValue().get(1)));
    }
}
