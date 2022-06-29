package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsNumber = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 0; i < commandsNumber; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            if (input[2].equals("going!")) {
                if (names.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    names.add(name);
                }
            } else {
                if (names.contains(name)) {
                    names.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
