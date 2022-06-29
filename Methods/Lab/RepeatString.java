package MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());

        printInput(input, repeat);
    }

    private static void printInput(String input, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.print(input);
        }
    }
}