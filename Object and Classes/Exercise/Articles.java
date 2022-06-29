package ObjectAndClassesExercise;

import java.util.Scanner;

public class Articles {
    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(", ");
        String title = data[0];
        String content = data[1];
        String author = data[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");
            if (command[0].equals("Edit")) {
                article.setContent(command[1]);
            } else if (command[0].equals("ChangeAuthor")) {
                article.setAuthor(command[1]);
            } else if (command[0].equals("Rename")) {
                article.setTitle(command[1]);
            }
        }
        System.out.println(article.toString());
    }
}
