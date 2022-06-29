package MethodsExercise;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (passwordLength(password) && lettersAndDigits(password) && contains2Digits(password)) {
            System.out.println("Password is valid");
        } else if (!passwordLength(password) || !lettersAndDigits(password) || !contains2Digits(password)) {
            if (!passwordLength(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!lettersAndDigits(password)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!contains2Digits(password)) {
                System.out.println("Password must have at least 2 digits");
            }
        }
    }

    private static boolean passwordLength(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        return false;
    }

    private static boolean lettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.toLowerCase().charAt(i);
            if ((symbol < 48 || symbol > 57) && (symbol < 97 || symbol > 122)) {
                return false;
            }
        }
        return true;
    }

    private static boolean contains2Digits(String password) {
        int countDigit = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                countDigit++;
            }
        }
        if (countDigit < 2) {
            return false;
        }
        return true;
    }
}
