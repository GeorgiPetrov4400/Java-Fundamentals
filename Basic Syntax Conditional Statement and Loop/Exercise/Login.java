package BasicSintaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String input = scanner.nextLine();
        String reverseUsername = new StringBuffer(username).reverse().toString();

        int count = 0;
        boolean isBlocked = false;
        while (!input.equals(reverseUsername)) {
            count++;
            if (count >= 4) {
                isBlocked = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (input.equals(reverseUsername)) {
            System.out.printf("User %s logged in.", username);
        }
        if (isBlocked) {
            System.out.printf("User %s blocked!", username);
        }

    }
}
