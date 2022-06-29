package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String command = data[0];
            switch (command) {
                case "Contains":
                    if (numbers.contains(data[1])) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (data[1].equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (Integer.parseInt(numbers.get(i)) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    if (data[1].equals("odd")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (Integer.parseInt(numbers.get(i)) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    if (data[1].equals("sum")) {
                        int sum = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            sum += Integer.parseInt(numbers.get(i));
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    int num = Integer.parseInt(data[2]);
                    if (data[1].equals("<")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            int element = Integer.parseInt(numbers.get(i));
                            if (element < num) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (data[1].equals(">")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            int element = Integer.parseInt(numbers.get(i));
                            if (element > num) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (data[1].equals(">=")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            int element = Integer.parseInt(numbers.get(i));
                            if (element >= num) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (data[1].equals("<=")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            int element = Integer.parseInt(numbers.get(i));
                            if (element <= num) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
