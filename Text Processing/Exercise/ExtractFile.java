package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String name = input.substring(input.lastIndexOf("\\") + 1, input.indexOf("."));
        String extension = input.substring(input.indexOf(".") + 1);
        System.out.printf("File name: %s%n", name);
        System.out.printf("File extension: %s%n", extension);

       /* String[] input = scanner.nextLine().split("\\\\");

        String[] data = input[3].split("\\.");

        System.out.printf("File name: %s%n", data[0]);
        System.out.printf("File extension: %s%n", data[1]); */

    }
}
