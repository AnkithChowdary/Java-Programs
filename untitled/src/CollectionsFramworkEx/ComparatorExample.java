package CollectionsFramworkEx;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class StudentDemo1 {

    private int id;
    private String name;
    private int age;

    StudentDemo1(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return this.id;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "ID: " + getId() + "\n";
    }
}

class StudentComparator implements Comparator<StudentDemo1> {
    @Override
    public int compare(StudentDemo1 s1, StudentDemo1 s2) {
        return s1.getId() - s2.getId();
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<StudentDemo1> studentsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Enter name: ");
            String name = scanner.next();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();

            studentsList.add(new StudentDemo1(age, name, id));
        }

        // Sort the list using the StudentComparator
        studentsList.sort(new StudentComparator());

        System.out.println("\nSorted List of Students:");
        for (StudentDemo1 student : studentsList) {
            System.out.println(student);
        }
    }
}
