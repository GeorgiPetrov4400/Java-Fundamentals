package ProgrammingFundamentalsMidExam05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            String[] data = input.split(" - ");
            String command = data[0];
            switch (command) {
                case "Collect":
                    if (items.contains(data[1])) {
                        input = scanner.nextLine();
                        continue;
                    } else {
                        items.add(data[1]);
                    }
                    break;
                case "Drop":
                    if (items.contains(data[1])) {
                        items.remove(data[1]);
                    } else {
                        input = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Combine Items":
                    String[] replaceCommand = data[1].split(":");
                    if (items.contains(replaceCommand[0])) {
                        items.add(items.indexOf(replaceCommand[0]) + 1, replaceCommand[1]);
                    } else {
                        input = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Renew":
                    if (items.contains(data[1])) {
                        String item = data[1];
                        items.remove(data[1]);
                        items.add(item);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", items));
    }
}
