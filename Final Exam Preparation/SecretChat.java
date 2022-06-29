package FinalExamPreparation;

import java.util.Collections;
import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] line = input.split(":\\|:");
            String command = line[0];
            switch (command) {
                case "InsertSpace":
                    message.insert(Integer.parseInt(line[1]), " ");
                    System.out.println(message);
                    break;
                case "Reverse":
                    StringBuilder substring = new StringBuilder(line[1]);
                    if (message.toString().contains(substring.toString())) {
                        int start = message.indexOf(String.valueOf(substring.charAt(0)));
                        int end = start + substring.length() - 1;
                        message.delete(start, end + 1);
                        substring.reverse();
                        message.append(substring);
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String currentText = line[1];
                    String replaceText = line[2];
                    String replaceMessage = message.toString().replace(currentText, replaceText);
                    message.setLength(0);
                    message.append(replaceMessage);
                    System.out.println(replaceMessage);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", message);
    }
}
