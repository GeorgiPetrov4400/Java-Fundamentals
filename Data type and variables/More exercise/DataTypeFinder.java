package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("END")) {
            System.out.println(getDataType(input));
           /* if (input.matches("[ -.:-~]") && input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else if (input.matches("[A-z][a-z]+")) {
                if (input.equals("true") || input.equals("false")) {
                    System.out.printf("%s is boolean type%n", input);
                    break;
                } else {
                    System.out.printf("%s is string type%n", input);
                }
            } else if (input.matches("[-\\d]+[.][\\d]+")) {
                System.out.printf("%s is floating point type%n", input);
            } else {
                System.out.printf("%s is integer type%n", input);
            }*/

            input = scanner.nextLine();
        }
    }

    private static String getDataType(String input) {
        return "string type";
    }

    private static String getDataType(char input) {
        return "character type";
    }

    private static String getDataType(int input) {
        return "integer type";
    }

    private static String getDataType(double input) {
        return "floating point type";
    }

    private static String getDataType(boolean input) {
        return "boolean type";
    }

}
