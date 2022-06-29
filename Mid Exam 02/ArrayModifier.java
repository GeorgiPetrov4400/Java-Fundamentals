package ProgrammingFundamentalsMidExam02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Long> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Long::parseLong).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            if (command[0].equals("decrease")) {
                for (int i = 0; i < numbers.size(); i++) {
                    numbers.add(i, numbers.get(i) - 1);
                    numbers.remove(i + 1);
                }
                input = scanner.nextLine();
                continue;
            }
            int index1 = Integer.parseInt(command[1]);
            int index2 = Integer.parseInt(command[2]);
            long element1 = numbers.get(index1);
            long element2 = numbers.get(index2);
            switch (command[0]) {
                case "swap":
                    numbers.add(index1, element2);
                    numbers.remove(index1 + 1);
                    numbers.add(index2, element1);
                    numbers.remove(index2 + 1);
                    break;
                case "multiply":
                    element1 = element1 * element2;
                    numbers.add(index1, element1);
                    numbers.remove(index1 + 1);
                    break;
            }

            input = scanner.nextLine();
        }
        // System.out.print(String.join(", ", (CharSequence) numbers));
        int count = 0;
        for (Long number : numbers) {
            count++;
            System.out.print(number);
            if (count != numbers.size()) {
                System.out.print(", ");
            }
        }
    }
}
