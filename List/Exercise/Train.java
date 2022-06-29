package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxWagonCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            if (command[0].equals("Add")) {
                wagons.add(Integer.parseInt(command[1]));
            } else {
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + Integer.parseInt(command[0]) <= maxWagonCapacity) {
                        wagons.add(i, wagons.get(i) + Integer.parseInt(command[0]));
                        wagons.remove(i + 1);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
