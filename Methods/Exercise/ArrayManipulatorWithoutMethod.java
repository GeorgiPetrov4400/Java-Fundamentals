package MethodsExercise;

import java.util.Scanner;

public class ArrayManipulatorWithoutMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] initialArray = input.split(" ");
        int[] numbers = new int[initialArray.length];
        for (int i = 0; i < initialArray.length; i++) {
            numbers[i] = Integer.parseInt(initialArray[i]);
        }

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            if (command[0].equals("exchange")) {
                int index = Integer.parseInt(command[1]);
                if (index >= 0 || index < command.length) {
                    System.out.println("Invalid index");
                } else {
                    String[] firstArray = new String[index];
                    for (int i = 0; i < index; i++) {
                        firstArray[i] += i;
                    }
                    String[] secondArray = new String[index + 1];
                    for (int i = index + 1; i < initialArray.length - 1; i++) {
                        secondArray[i] += i;
                    }
                }
            } else if (command[0].equals("max")) {
                int maxEvenNum = 0;
                int maxOddNum = 0;
                if (command[1].equals("even")) {
                    for (int num : numbers) {
                        if (num > maxEvenNum) {
                            maxEvenNum = num;
                        }
                    }
                    System.out.println(maxEvenNum);
                } else if (command[1].equals("odd")) {
                    for (int num : numbers) {
                        if (num > maxOddNum) {
                            maxOddNum = num;
                        }
                    }
                    System.out.println(maxOddNum);
                }
            } else if (command[0].equals("min")) {
                int minEvenNum = 0;
                int minOddNum = 0;
                if (command[1].equals("even")) {
                    for (int num : numbers) {
                        if (num > minEvenNum) {
                            minEvenNum = num;
                        }
                    }
                    System.out.println(minEvenNum);
                } else if (command[1].equals("odd")) {
                    for (int num : numbers) {
                        if (num > minOddNum) {
                            minOddNum = num;
                        }
                    }
                    System.out.println(minOddNum);
                }
            } else if (command[0].equals("first")) {
                if (command[1].equals("even")) {
                    int count = 0;
                    for (int i = 0; i < numbers.length - 1; i++) {
                        count++;
                        if (numbers[i] % 2 == 0 && count <= numbers.length - 1) {
                            System.out.println(count);
                            break;
                        } else {
                            System.out.println("Invalid count");
                        }
                    }
                } else if (command[1].equals("odd")) {
                    int count = 0;
                    for (int i = 0; i < numbers.length - 1; i++) {
                        count++;
                        if (numbers[i] % 2 != 0 && count <= numbers.length - 1) {
                            System.out.println(count);
                            break;
                        } else {
                            System.out.println("Invalid count");
                        }
                    }
                }
            } else if (command[0].equals("last")) {
                if (command[1].equals("even")) {
                    int count = 0;
                    for (int i = numbers.length - 1; i > 0; i--) {
                        count++;
                        if (numbers[i] % 2 == 0 && count >= numbers.length - 1) {
                            System.out.println(count);
                            break;
                        } else {
                            System.out.println("Invalid count");
                        }
                    }
                } else if (command[1].equals("odd")) {
                    int count = 0;
                    for (int i = numbers.length - 1; i > 0; i--) {
                        count++;
                        if (numbers[i] % 2 != 0 && count >= numbers.length - 1) {
                            System.out.println(count);
                            break;
                        } else {
                            System.out.println("Invalid count");
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }
    }
}
