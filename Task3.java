import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    private String name;
    private int rollNumber;
    private String grade;
    private String email;

    public Task3(String name, int rollNumber, String grade, String email) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "\n Name of Student: " + name + ",\n Roll Number of Student: " + rollNumber + ", \n Grades of Student: " + grade
                + ",\n Email of Student: " + email;
    }
}

class StudentManagementSystem {
    private List<Task3> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Task3 student) {
        students.add(student);
    }

    public void removeStudent(int rollNumber) {
        for (Task3 student : students) {
            if (student.getRollNumber() == rollNumber) {
                students.remove(student);
                break;
            }
        }
    }

    public Task3 searchStudent(int rollNumber) {
        for (Task3 student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student details found.");
        } else {
            for (Task3 student : students) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student details in System");
            System.out.println("2. Remove Student details from System");
            System.out.println("3. Search Student details in System");
            System.out.println("4. Display All Students details");
            System.out.println("5. Exit from system");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = input.nextLine();

                    System.out.print("Enter student roll number: ");
                    int rollNumber = input.nextInt();
                    input.nextLine(); // Consume the newline character
                    System.out.print("Enter student grade: ");
                    String grade = input.nextLine();

                    System.out.print("Enter student email: ");
                    String email = input.nextLine();

                    Task3 student = new Task3(name, rollNumber, grade, email);
                    system.addStudent(student);
                    System.out.println("Student details added successfully.");
                    break;
                case 2:
                    System.out.print("Enter student roll number to remove details from system : ");
                    int removeRollNumber = input.nextInt();
                    system.removeStudent(removeRollNumber);
                    System.out.println("Student details removed successfully from system.");
                    break;
                case 3:
                    System.out.print("Enter student roll number to search: ");
                    int searchRollNumber = input.nextInt();
                    Task3 foundStudent = system.searchStudent(searchRollNumber);
                    if (foundStudent != null) {
                        System.out.println("Student details found: " + foundStudent);
                    } else {
                        System.out.println("Student details not found in system.");
                    }
                    break;
                case 4:
                    system.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting from the application...");
                    System.exit(0);
                default:
                    System.out.println("Please enter correct choice again.");
                    break;
            }
        }

    }

}
