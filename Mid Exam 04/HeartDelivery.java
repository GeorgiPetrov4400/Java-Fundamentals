package ProgrammingFundamentalsMidExam04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String neighborhood = scanner.nextLine();
        List<Integer> neighborhoodHouses = Arrays.stream(neighborhood.split("@"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        int jumpCounter = 0;
        while (!input.equals("Love!")) {
            String[] data = input.split(" ");
            int jump = Integer.parseInt(data[1]);
            jumpCounter += jump;
            if (jumpCounter > neighborhoodHouses.size() - 1) {
                jumpCounter = 0;
            }
            neighborhoodHouses.add(jumpCounter, neighborhoodHouses.get(jumpCounter) - 2);
            neighborhoodHouses.remove(jumpCounter + 1);
            if (neighborhoodHouses.get(jumpCounter) == 0) {
                System.out.printf("Place %d has Valentine's day.%n", jumpCounter);
            }
            if (neighborhoodHouses.get(jumpCounter) < 0) {
                System.out.printf("Place %d already had Valentine's day.%n", jumpCounter);
                neighborhoodHouses.add(jumpCounter, neighborhoodHouses.get(jumpCounter) + 2);
                neighborhoodHouses.remove(jumpCounter + 1);
            }

            input = scanner.nextLine();
        }
        int countFail = 0;
        for (Integer houses : neighborhoodHouses) {
            if (houses > 0) {
                countFail++;
            }
        }
        System.out.printf("Cupid's last position was %d.%n", jumpCounter);
        if (countFail == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n", countFail);
        }
    }
}
