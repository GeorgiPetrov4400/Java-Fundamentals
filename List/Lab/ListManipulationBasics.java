package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String command = data[0];
            switch (command) {
                case "Add":
                    numbers.add(numbers.size(), data[1]);
                    break;
                case "Remove":
                    numbers.remove(data[1]);
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(data[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(data[2]), data[1]);
                    break;
            }
            input = scanner.nextLine();
        }
        for (String num : numbers) {
            System.out.print(num + " ");
        }
    }
}
