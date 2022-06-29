package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String command = data[0];
            if (command.equals("exchange")) {
                int index = Integer.parseInt(data[1]);
                if (isValidIndex(index, array.length)) {
                    exchange(array, index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("max")) {
                if (data[1].equals("even")) {
                    printEvenMax(array);
                } else {
                    printOddMax(array);
                }
            } else if (command.equals("min")) {
                if (data[1].equals("even")) {
                    printEvenMin(array);
                } else {
                    printOddMin(array);
                }
            } else if (command.equals("first")) {
                int count = Integer.parseInt(data[1]);
                if (count > array.length) {
                    System.out.println("Invalid count");
                } else {
                    if (data[2].equals("even")) {
                        printFirstEven(array, count);
                    } else {
                        printFirstOdd(array, count);
                    }
                }
            } else if (command.equals("last")) {
                int count = Integer.parseInt(data[1]);
                if (count > array.length) {
                    System.out.println("Invalid count");
                } else {
                    if (data[2].equals("even")) {
                        printLastEven(array, count);
                    } else {
                        printLastOdd(array, count);
                    }
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(Arrays.toString(array));
    }

    private static boolean isValidIndex(int index, int length) {
        return index >= 0 && index < length;
    }

    private static void exchange(int[] array, int index) {
        int[] firstArray = new int[index + 1];
        int[] secondArray = new int[array.length - index - 1];
        for (int i = 0; i <= index; i++) {
            firstArray[i] = array[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = array[index + 1 + i];
        }
        for (int i = 0; i < array.length; i++) {
            if (i < secondArray.length) {
                array[i] = secondArray[i];
            } else {
                array[i] = firstArray[i - secondArray.length];
            }
        }
    }

    private static void printEvenMax(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber <= array[i] && array[i] % 2 == 0) {
                maxNumber = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printOddMax(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber <= array[i] && array[i] % 2 != 0) {
                maxNumber = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printEvenMin(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (minNumber >= array[i] && array[i] % 2 == 0) {
                minNumber = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printOddMin(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (minNumber >= array[i] && array[i] % 2 != 0) {
                minNumber = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printFirstEven(int[] array, int count) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && count > 0) {
                arr[i] = array[i];
                count--;
            } else {
                arr[i] = -1;
            }
        }
        printArray(arr);
    }

    private static void printFirstOdd(int[] array, int count) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && count > 0) {
                arr[i] = array[i];
                count--;
            } else {
                arr[i] = -1;
            }
        }
        printArray(arr);
    }

    private static void printLastEven(int[] array, int count) {
        int[] arr = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0 && count > 0) {
                arr[i] = array[i];
                count--;
            } else {
                arr[i] = -1;
            }
        }
        printArray(arr);
    }

    private static void printLastOdd(int[] array, int count) {
        int[] arr = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0 && count > 0) {
                arr[i] = array[i];
                count--;
            } else {
                arr[i] = -1;
            }
        }
        printArray(arr);
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        boolean printFirst = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                if (printFirst) {
                    System.out.print(array[i]);
                    printFirst = false;
                } else {
                    System.out.print(", " + array[i]);
                }
            }
        }
        System.out.println("]");
    }
}
