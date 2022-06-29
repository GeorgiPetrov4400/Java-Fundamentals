package FinalExamApril2022;

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder initialString = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String command = data[0];
            switch (command) {
                case "Translate":
                    String currentSymbol = data[1];
                    String replaceSymbol = data[2];
                    String replacedString = initialString.toString().replace(currentSymbol, replaceSymbol);
                    initialString.setLength(0);
                    initialString.append(replacedString);
                    System.out.println(initialString);
                    break;
                case "Includes":
                    String substring = data[1];
                    if (initialString.toString().contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String startSubstring = data[1];
                    if (initialString.toString().contains(startSubstring)) {
                        int startSubstringIndex = initialString.toString().indexOf(startSubstring);
                        if (startSubstringIndex == 0) {
                            System.out.println("True");
                        } else {
                            System.out.println("False");
                        }
                    }
                    System.out.println("False");
                    break;
                case "Lowercase":
                    String replaceString = initialString.toString().toLowerCase();
                    initialString.setLength(0);
                    initialString.append(replaceString);
                    System.out.println(initialString);
                    break;
                case "FindIndex":
                    String lastSymbol = data[1];
                    int lastSymbolIndex = initialString.lastIndexOf(lastSymbol);
                    System.out.println(lastSymbolIndex);
                    break;
                case "Remove":
                    int index = Integer.parseInt(data[1]);
                    int count = Integer.parseInt(data[2]);
                    int countIter = 0;
                    for (int i = 0; i < count; i++) {
                        countIter++;
                        initialString.deleteCharAt(index);
                        if (countIter == count) {
                            break;
                        }
                        i--;
                    }
                    System.out.println(initialString);
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
