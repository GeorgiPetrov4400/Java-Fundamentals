package ListExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String command = data[0];
            switch (command) {
                case "Delete":
                    //numbers.removeAll(Collections.singleton(Integer.parseInt(data[1])));
                    int element = Integer.parseInt(data[1]);
                    //numbers.removeAll(Arrays.asList(element));
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == element) {
                            numbers.remove(i);
                            i--;
                        }
                    }
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(data[2]), Integer.parseInt(data[1]));
                    break;
            }
            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
