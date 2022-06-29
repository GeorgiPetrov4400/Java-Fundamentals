package ObjectAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    static class Person {
        String name;
        String ID;
        int years;

        public Person(String name, String ID, int years) {
            this.name = name;
            this.ID = ID;
            this.years = years;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public int getYears() {
            return years;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.getName(), this.getID(), this.getYears());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] information = input.split(" ");
            Person person = new Person(information[0], information[1], Integer.parseInt(information[2]));
            personList.add(person);

            input = scanner.nextLine();
        }
        personList.stream().sorted((p1, p2) -> Integer.compare(p1.getYears(), p2.getYears()))
                .forEach(person -> System.out.println(person.toString()));
    }
}
