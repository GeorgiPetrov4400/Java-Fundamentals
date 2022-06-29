package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String input = scanner.nextLine();
        String input2 = scanner.nextLine();

        System.out.println(getMax(input, input2));
    }

    private static String getMax(String input, String input2) {
        if (input.compareTo(input2) >= 0) {
            return input;
        }
        return input2;
    }

    private static char getMax(char input, char input2) {
        if (input > input2) {
            return input;
        }
        return input2;
    }

    private static int getMax(int input, int input2) {
        if (input > input2) {
            return input;
        }
        return input2;
    }
}
