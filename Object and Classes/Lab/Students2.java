package ObjectAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    static class Student {
        String firstName;
        String lastName;
        int age;
        String town;

        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

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

            int index = studentIndex(students, firstName, lastName);
            if (index == -1) {
                students.add(new Student(firstName, lastName, age, town));
            } else {
                students.set(index, new Student(firstName, lastName, age, town));
            }

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();

        for (Student person : students) {
            if (person.getTown().equals(city)) {
                System.out.printf("%s %s is %d years old%n", person.getFirstName(), person.getLastName(), person.getAge());
            }
        }
    }

    private static int studentIndex(List<Student> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) {
                return i;
            }
        }
        return -1;
    }
}
