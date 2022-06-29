package FinalExamPreparation;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder encryptedMessage = new StringBuilder(scanner.nextLine());

        String line = scanner.nextLine();
        while (!line.equals("Decode")) {
            String[] input = line.split("\\|");
            String command = input[0];
            switch (command) {
                case "Move":
                    int index = Integer.parseInt(input[1]);
                    if (index >= 0 && index <= encryptedMessage.length()) {
                        String lastSubstring = encryptedMessage.substring(0, index);
                        String firstSubstring = encryptedMessage.substring(index, encryptedMessage.length());
                        encryptedMessage.setLength(0);
                        encryptedMessage.append(firstSubstring);
                        encryptedMessage.append(lastSubstring);
                        break;
                    } else {
                        line = scanner.nextLine();
                        continue;
                    }
                case "Insert":
                    int index2 = Integer.parseInt(input[1]);
                    if (index2 >= 0 && index2 <= encryptedMessage.length()) {
                        String symbols = input[2];
                        encryptedMessage.insert(index2, symbols);
                        break;
                    } else {
                        line = scanner.nextLine();
                        continue;
                    }
                case "ChangeAll":
                    String currentText = input[1];
                    String replaceText = input[2];
                    String replaceMessage = encryptedMessage.toString().replace(currentText, replaceText);
                    //  String replaceMessage = encryptedMessage.toString().replaceAll(currentText, replaceText);
                    encryptedMessage.setLength(0);
                    encryptedMessage.append(replaceMessage);
                    break;
                default:
                    line = scanner.nextLine();
                    continue;
            }

            line = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s%n", encryptedMessage);
    }
}
