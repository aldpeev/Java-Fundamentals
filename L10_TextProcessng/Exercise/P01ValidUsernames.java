package L10_TextProcessng.Exercise;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernamesArr = scanner.nextLine().split(", ");
        for (String s : usernamesArr) {
            if (s.length() >= 3 && s.length() <= 16){
                boolean isValidUser = true;
                for (int i = 0; i < s.length(); i++) {
                    if (!Character.isLetterOrDigit(s.charAt(i)) && !Character.valueOf(s.charAt(i)).equals('-') && !Character.valueOf(s.charAt(i)).equals('_')){
                        isValidUser = false;
                        break;
                    }
                }
                if (isValidUser){
                    System.out.println(s);
                }
            }
        }

    }
}
