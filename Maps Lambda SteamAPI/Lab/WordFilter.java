package MapsLambdaStreamAPILab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordsList = Arrays.stream(scanner.nextLine().split(" "))
                .filter(word -> word.length() % 2 == 0).collect(Collectors.toList());

        for (String word : wordsList) {
            System.out.println(word);
        }
    }
}
