package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    if (Integer.parseInt(command[2]) >= 0 && Integer.parseInt(command[2]) <= numbers.size()) {
                        numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) <= numbers.size()) {
                        numbers.remove(Integer.parseInt(command[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(command[2]);
                    switch (command[1]) {
                        case "left":
                            int countIter = 0;
                            for (int i = 0; i < count; i++) {
                                countIter++;
                                int firstElement = numbers.get(i);
                                numbers.remove(numbers.get(0));
                                numbers.add(firstElement);
                                i--;
                                if (countIter == count) {
                                    break;
                                }
                            }
                            break;
                        case "right":
                            int countIter2 = 0;
                            for (int i = count; i > 0; i--) {
                                countIter2++;
                                int lastElement = numbers.get(numbers.size() - 1);
                                numbers.remove(numbers.size() - 1);
                                numbers.add(0, lastElement);
                                i++;
                                if (countIter2 == count) {
                                    break;
                                }
                            }
                            break;
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}
