package L10_TextProcessng.Exercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = scanner.nextLine();

        int startIndex = filePath.lastIndexOf('\\');
        int endIndex = filePath.lastIndexOf('.');

        System.out.printf("File name: %s%nFile extension: %s", filePath.substring(startIndex + 1,endIndex), filePath.substring(endIndex + 1));
    }
}
