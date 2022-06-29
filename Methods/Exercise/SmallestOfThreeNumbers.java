package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(getMinNumber(firstNum, secondNum, thirdNum));
    }

    private static int getMinNumber(int firstNum, int secondNum, int thirdNum) {
        if (firstNum < secondNum && firstNum < thirdNum) {
            return firstNum;
        } else if (secondNum < firstNum && secondNum < thirdNum) {
            return secondNum;
        }
        return thirdNum;
    }
}
