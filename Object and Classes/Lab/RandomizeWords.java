package ObjectAndClassesLab;

import java.util.*;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> text = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Random random = new Random();
        for (int i = 0; i < text.size(); i++) {
            int position = random.nextInt(text.size());
            Collections.swap(text, i, position);
        }
        /*for (String word : text) {
            System.out.println(word);
        }*/
        System.out.println(String.join(System.lineSeparator(), text));
    }
}
