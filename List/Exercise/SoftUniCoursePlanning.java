package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> data = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("course start")) {
            String[] command = input.split(":");
            switch (command[0]) {
                case "Add":
                    if (data.contains(command[1])) {
                        input = scanner.nextLine();
                        continue;
                    } else {
                        data.add(command[1]);
                    }
                    break;
                case "Insert":
                    if (data.contains(command[1])) {
                        input = scanner.nextLine();
                        continue;
                    } else {
                        int index = Integer.parseInt(command[2]);
                        if (index >= 0 && index < data.size()) {
                            data.add(Integer.parseInt(command[2]), command[1]);
                        } else {
                            break;
                        }
                    }
                    break;
                case "Remove":
                    if (data.contains(command[1])) {
                        data.remove(command[1]);
                        data.remove(command[1] + "-" + "Exercise");
                    } else {
                        input = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Swap":
                    if (data.contains(command[1]) && data.contains(command[2])) {
                        String firstElement = command[1];
                        String secondElement = command[2];
                        int firstIndex = data.indexOf(command[1]);
                        int secondIndex = data.indexOf(command[2]);
                        data.add(firstIndex, secondElement);
                        data.remove(firstIndex + 1);
                        data.add(secondIndex, firstElement);
                        data.remove(secondIndex + 1);
                        if (data.contains(command[1] + "-" + "Exercise")) {
                            String element = command[1] + "-" + "Exercise";
                            data.remove(command[1] + "-" + "Exercise");
                            //data.remove(data.indexOf(command[1] + "-" + "Exercise"));
                            data.add(data.indexOf(command[1]) + 1, element);
                        }
                        if (data.contains(command[2] + "-" + "Exercise")) {
                            String element = command[2] + "-" + "Exercise";
                            data.remove(command[2] + "-" + "Exercise");
                            //data.remove(data.indexOf(command[2] + "-" + "Exercise"));
                            data.add(data.indexOf(command[2]) + 1, element);
                        }
                    } else {
                        input = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Exercise":
                    String lessonTitle = command[1] + "-" + "Exercise";
                    if (data.contains(command[1]) && !data.contains(lessonTitle)) {
                        int index = data.indexOf(command[1]);
                        data.add(index + 1, lessonTitle);
                    } else if (!data.contains(command[1])) {
                        data.add(command[1]);
                        int index = data.indexOf(command[1]);
                        data.add(index + 1, lessonTitle);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        int count = 0;
        for (String element : data) {
            count++;
            System.out.printf("%d.%s%n", count, element);
        }
    }
}
