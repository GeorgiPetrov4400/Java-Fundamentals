package TextProcessingLab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        StringBuilder arrayString = new StringBuilder();

        for (String text : input) {
            int size = text.length();
            for (int i = 0; i < size; i++) {
                arrayString.append(text);
            }
        }
        System.out.println(arrayString);
    }
}
