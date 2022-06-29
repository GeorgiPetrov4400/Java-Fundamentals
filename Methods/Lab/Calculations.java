package MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        printResult(command, firstNum, secondNum);
    }

    private static void printResult(String command, int firstNum, int secondNum) {
        int result = 0;
        if (command.equals("add")) {
            result = firstNum + secondNum;
        } else if (command.equals("multiply")) {
            result = firstNum * secondNum;
        } else if (command.equals("subtract")) {
            result = firstNum - secondNum;
        } else {
            result = firstNum / secondNum;
        }
        System.out.println(result);
    }
}

