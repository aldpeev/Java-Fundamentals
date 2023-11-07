package L08_ObjectsAndClasses.Exercise;

import java.util.Scanner;

public class P02Articles {
    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void editContent(String content) {
            this.content = content;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }

        public void changeTitle(String title) {
            this.title = title;
        }

        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] article = scanner.nextLine().split(", ");
        Article originalArticle = new Article(article[0], article[1], article[2]);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");
            switch (command[0]){
                case "Edit":
                    originalArticle.editContent(command[1]);
                    break;
                case "ChangeAuthor":
                    originalArticle.changeAuthor(command[1]);
                    break;
                case "Rename":
                    originalArticle.changeTitle(command[1]);
                    break;
            }
        }

        System.out.println(originalArticle.toString());

    }
}
