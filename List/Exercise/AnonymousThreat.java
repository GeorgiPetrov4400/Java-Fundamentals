package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> data = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("3:1")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "merge":
                    List<String> mergedArray = new ArrayList<>();
                    int startIndex = Math.max(0, Integer.parseInt(command[1]));
                    int endIndex = Math.min(Integer.parseInt(command[2]), data.size() - 1);
                    if (startIndex > 0 && startIndex < data.size()) {
                        mergedArray.addAll(data.subList(0, startIndex));
                    }
                    if (startIndex < data.size()) {
                        List<String> mergeElements = data.subList(startIndex, endIndex + 1);
                        String merged = "";
                        for (String element : mergeElements) {
                            merged += element;
                        }
                        mergedArray.add(merged);
                    }
                    if (endIndex + 1 < data.size()) {
                        mergedArray.addAll(data.subList(endIndex + 1, data.size()));
                    }
                    if (!mergedArray.isEmpty()) {
                        data = mergedArray;
                    }
                    break;
                case "divide":
                    mergedArray = new ArrayList<>();
                    int index = Integer.parseInt(command[1]);
                    int parts = Integer.parseInt(command[2]);
                    String element = data.get(index);
                    if (element.length() % parts == 0) {
                        int symbols = element.length() / parts;
                        for (int i = 0; i < parts; i++) {
                            mergedArray.add(element.substring(0, symbols));
                            element = element.substring(symbols);
                        }
                        data.remove(index);
                        data.addAll(index, mergedArray);

                    } else {
                        int symbols = element.length() / parts;
                        for (int i = 0; i < parts; i++) {
                            if (i == parts - 1) {
                                mergedArray.add(element);
                            } else {
                                mergedArray.add(element.substring(0, symbols));
                                element = element.substring(symbols);
                            }
                        }
                        data.remove(index);
                        data.addAll(index, mergedArray);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        data.forEach(s -> System.out.print(s + " "));
    }
}
