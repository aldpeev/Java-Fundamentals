package L11_Regex.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern p = Pattern.compile("[STARstar]");
        Pattern decrypt = Pattern.compile("[^@\\-!:>]*@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attack>[AD])![^@\\-!:>]*->(?<soldiers>\\d+)[^@\\-!:>]*");

        Map<String, ArrayList<String>> planetsMap = new LinkedHashMap<>();
        planetsMap.put("attack", new ArrayList<>());
        planetsMap.put("destroy", new ArrayList<>());

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher m = p.matcher(input);

            int count = 0;
            while (m.find()) {
                count++;
            }

            StringBuilder sbDecrypted = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                sbDecrypted.append(Character.toChars(input.charAt(j) - count));
            }

            Matcher matchDecrypt = decrypt.matcher(sbDecrypted);
            if (matchDecrypt.find()) {
                if (matchDecrypt.group("attack").equals("A")) {
                    planetsMap.get("attack").add(matchDecrypt.group("planet"));
                } else {
                    planetsMap.get("destroy").add(matchDecrypt.group("planet"));
                }
            }

        }

        for (Map.Entry<String, ArrayList<String>> el : planetsMap.entrySet()) {
            if (el.getKey().equals("attack")) {
                System.out.println("Attacked planets: " + el.getValue().size());
                el.getValue().stream().sorted((e, e1) -> e.compareTo(e1)).forEach(e -> System.out.println("-> " + e));

            } else {
                System.out.println("Destroyed planets: " + el.getValue().size());
                el.getValue().stream().sorted((e, e1) -> e.compareTo(e1)).forEach(e -> System.out.println("-> " + e));
            }
        }

    }
}
