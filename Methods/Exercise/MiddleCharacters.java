package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] text = input.split("");

        printMiddleCharacter(text);
    }

    private static void printMiddleCharacter(String[] text) {
        if (text.length % 2 == 0) {
            int symbol = (int) (text.length / 2);
            int symbol2 = (int) (text.length / 2) - 1;
            System.out.print(text[symbol2]);
            System.out.print(text[symbol]);
        } else {
            int symbol = (int) (text.length / 2);
            System.out.print(text[symbol]);
        }
    }
}

