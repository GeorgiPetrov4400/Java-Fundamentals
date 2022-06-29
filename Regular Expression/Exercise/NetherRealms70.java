package RegularExpressionExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("[\\s]*[,][\\s]*");
        for (String demonName : line) {
            String regexHealth = "[A-Za-z]";
            Pattern patternHealth = Pattern.compile(regexHealth);
            Matcher matcherHealth = patternHealth.matcher(demonName);

            StringBuilder name = new StringBuilder();
            while (matcherHealth.find()) {
                String symbol = matcherHealth.group();
                name.append(symbol);
            }
            int health = 0;
            for (int i = 0; i < name.length(); i++) {
                char asciiSymbol = name.charAt(i);
                health += asciiSymbol;
            }
            String regexDamage = "[-\\d.]+";
            Pattern patternDamage = Pattern.compile(regexDamage);
            Matcher matcherDamage = patternDamage.matcher(demonName);

            double damage = 0.0;
            while (matcherDamage.find()) {
                double number = Double.parseDouble(matcherDamage.group());
                damage += number;
            }
            if (damage > 0) {
                String regexSymbol = "[*/]";
                Pattern patternSymbol = Pattern.compile(regexSymbol);
                Matcher matcherSymbol = patternSymbol.matcher(demonName);

                while (matcherSymbol.find()) {
                    String symbol = matcherSymbol.group();
                    if (symbol.equals("*")) {
                        damage *= 2;
                    } else if (symbol.equals("/")) {
                        damage /= 2;
                    }
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", demonName, health, damage);
        }
    }
}
