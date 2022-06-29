package ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> newList = new ArrayList<>();
        if (firstList.size() < secondList.size()) {
            for (int i = 0; i < firstList.size(); i++) {
                firstList.get(i);
                newList.add(firstList.get(i));
                secondList.get(i);
                newList.add(secondList.get(i));
            }
            newList.addAll(secondList.subList(firstList.size(), secondList.size()));
        } else {
            for (int i = 0; i < secondList.size(); i++) {
                firstList.get(i);
                newList.add(firstList.get(i));
                secondList.get(i);
                newList.add(secondList.get(i));
            }
            newList.addAll(firstList.subList(secondList.size(), firstList.size()));
        }
        for (Integer num : newList) {
            System.out.print(num + " ");
        }
    }
}
