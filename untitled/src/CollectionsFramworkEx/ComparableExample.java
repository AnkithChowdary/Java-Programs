package CollectionsFramworkEx;

import java.util.ArrayList;
import java.util.Scanner;

class StudentDemo implements Comparable<StudentDemo> {

    private int id;
    private String name;
    private int age;

    StudentDemo(int age, String name, int id) {
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
                "Id: " + getId() + "\n";
    }

    @Override
    public int compareTo(StudentDemo li) {
        return this.id - li.id;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<StudentDemo> studentsList = new ArrayList<>();
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

            studentsList.add(new StudentDemo(age, name, id));
        }

        // Sort the list
        studentsList.sort(StudentDemo::compareTo);

        System.out.println("\nSorted List of Students:");
        for (StudentDemo student : studentsList) {
            System.out.println(student);
        }
    }
}
