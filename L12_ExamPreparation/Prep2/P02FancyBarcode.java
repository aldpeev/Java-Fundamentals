package L12_ExamPreparation.Prep2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern p = Pattern.compile("^@#+[A-Z](?<product>[A-Za-z0-9]{4,})[A-Z]@#+$");

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            Matcher m = p.matcher(input);
            if (m.find()){
                String product = m.group("product");

                StringBuilder sb = new StringBuilder();
                for (char c : product.toCharArray()){
                    if (Character.isDigit(c)){
                        sb.append(c);
                    }
                }

                if (sb.length() == 0){
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", sb);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
