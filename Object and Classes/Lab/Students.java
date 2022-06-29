package ObjectAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {
        String firstName;
        String lastName;
        int age;
        String town;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String town = data[3];

            Student currentStudent = new Student();
            currentStudent.setFirstName(firstName);
            currentStudent.setLastName(lastName);
            currentStudent.setAge(age);
            currentStudent.setTown(town);

            students.add(currentStudent);

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();

        for (Student person : students) {
            if (person.getTown().equals(city)) {
                System.out.printf("%s %s is %d years old%n", person.getFirstName(), person.getLastName(), person.getAge());
            }
        }
    }
}

