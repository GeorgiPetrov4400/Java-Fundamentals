package MapsLambdaStreamAPILab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> wordSynonymMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (wordSynonymMap.containsKey(word)) {
                wordSynonymMap.get(word).add(synonym);
            } else {
                wordSynonymMap.put(word, new ArrayList<>());
                wordSynonymMap.get(word).add(synonym);
            }
        }
        for (Map.Entry<String, List<String>> entry : wordSynonymMap.entrySet()) {
            System.out.printf("%s - ", entry.getKey());
            for (List<String> value : wordSynonymMap.values()) {
                System.out.print(String.join(", ", entry.getValue()));
                break;
            }
            System.out.println();
        }
    }
}
