package FinalExamPreparation;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] data = input.split(" ");
            String command = data[0];
            switch (command) {
                case "TakeOdd":
                    StringBuilder oddPassword = new StringBuilder();
                    for (int i = 0; i < password.length(); i++) {
                        if (i % 2 != 0) {
                            char oddSymbolIndex = password.charAt(i);
                            oddPassword.append(oddSymbolIndex);
                        }
                    }
                    password.setLength(0);
                    password.append(oddPassword);
                    System.out.println(password);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(data[1]);
                    int length = Integer.parseInt(data[2]);
                    password.delete(startIndex, startIndex + length);
                    System.out.println(password);
                    break;
                case "Substitute":
                    String stringToReplace = data[1];
                    String replaceString = data[2];
                    if (password.toString().contains(stringToReplace)) {
                        String replacedPassword = password.toString().replace(stringToReplace, replaceString);
                        password.setLength(0);
                        password.append(replacedPassword);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password);
    }
}
