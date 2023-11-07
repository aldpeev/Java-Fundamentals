package L01_BasicSyntax.Exercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        StringBuilder sb = new StringBuilder(userName);
        String password = sb.reverse().toString();

        int count = 0;
        boolean isBlocked = false;

        String userPass = scanner.nextLine();
        while (!userPass.equals(password)) {
            System.out.println("Incorrect password. Try again.");
            count++;
            if (count == 3) {
                System.out.printf("User %s blocked!", userName);
                isBlocked = true;
                break;
            }
            userPass = scanner.nextLine();
        }

        if (!isBlocked) {
            System.out.printf("User %s logged in.", userName);
        }
    }
}
