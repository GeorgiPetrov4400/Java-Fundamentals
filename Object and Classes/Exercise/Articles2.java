package ObjectAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articleList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            Article article = new Article(input[0], input[1], input[2]);
            articleList.add(article);
        }
        String command = scanner.nextLine();
        if (command.equals("title")) {
            articleList.stream().sorted((a1, a2) -> a1.title.compareTo(a2.title))
                    .forEach(p -> System.out.println(p.toString()));
        } else if (command.equals("content")) {
            articleList.stream().sorted((a1, a2) -> a1.content.compareTo(a2.content))
                    .forEach(p -> System.out.println(p.toString()));
        } else {
            articleList.stream().sorted((a1, a2) -> a1.author.compareTo(a2.author))
                    .forEach(p -> System.out.println(p.toString()));
        }
    }
}

