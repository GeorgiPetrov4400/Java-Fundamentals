package ProgrammingFundamentalsMidExam04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            String[] data = input.split(" ");
            String command = data[0];
            switch (command) {
                case "Urgent":
                    if (products.contains(data[1])) {
                        input = scanner.nextLine();
                        continue;
                    } else {
                        products.add(0, data[1]);
                    }
                    break;
                case "Unnecessary":
                    if (products.contains(data[1])) {
                        products.remove(data[1]);
                    } else {
                        input = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Correct":
                    if (products.contains(data[1])) {
                        products.add(products.indexOf(data[1]), data[2]);
                        products.remove(data[1]);
                    }
                    break;
                case "Rearrange":
                    if (products.contains(data[1])) {
                        String element = data[1];
                        products.remove(data[1]);
                        products.add(element);
                    } else {
                        input = scanner.nextLine();
                        continue;
                    }
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", products));
    }
}
