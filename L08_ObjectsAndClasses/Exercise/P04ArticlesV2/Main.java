package L08_ObjectsAndClasses.Exercise.P04ArticlesV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articleList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] articleData = scanner.nextLine().split(", ");
            Article currentArticle = new Article(articleData[0], articleData[1], articleData[2]);

            articleList.add(currentArticle);
        }


        String sortFactor = scanner.nextLine();
        switch (sortFactor){
            case "title":
            case "content":
            case "author":
                articleList.stream().forEach(System.out::println);
                break;
        }

    }
}
