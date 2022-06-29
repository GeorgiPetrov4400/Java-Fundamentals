package TextProcessingLab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String text = scanner.nextLine();

        int indexToRemove = text.indexOf(toRemove);

        while (indexToRemove != -1) {
            text = text.replace(toRemove, "");
            indexToRemove = text.indexOf(toRemove);
        }
        System.out.println(text);
    }
}
