package ProgrammingFundamentalsMidExam05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        int initialHealth = 100;
        int sumBitcoin = 0;
        int countRoom = 0;
        for (String room : rooms) {
            String[] input = room.split(" ");
            switch (input[0]) {
                case "potion":
                    countRoom++;
                    int health = Integer.parseInt(input[1]);
                    int realHealth = 100 - initialHealth;
                    initialHealth += health;
                    if (initialHealth > 100) {
                        System.out.printf("You healed for %d hp.%n", realHealth);
                        initialHealth = 100;
                    } else {
                        System.out.printf("You healed for %d hp.%n", health);
                    }
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                    break;
                case "chest":
                    countRoom++;
                    int bitcoin = Integer.parseInt(input[1]);
                    sumBitcoin += bitcoin;
                    System.out.printf("You found %d bitcoins.%n", bitcoin);
                    break;
                default:
                    countRoom++;
                    int monsterHealth = Integer.parseInt(input[1]);
                    initialHealth -= monsterHealth;
                    if (initialHealth <= 0) {
                        System.out.printf("You died! Killed by %s.%n", input[0]);
                        System.out.printf("Best room: %d%n", countRoom);
                        return;
                    } else {
                        System.out.printf("You slayed %s.%n", input[0]);
                    }
                    break;
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", sumBitcoin);
        System.out.printf("Health: %d%n", initialHealth);
    }
}
