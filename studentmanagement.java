import java.util.Scanner;

public class studentmanagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no. of students :  ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        StudentManager manager = new StudentManager(numStudents);
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter Student ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            Student student = new Student(studentId, name, age);
            manager.addStudent(student);
        }

        manager.displayAllStudents();

        scanner.close();
    }
}

class Student {
    private int studentId;
    private String name;
    private int age;

    public Student(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age! Must be greater than 0.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("-----------------------------");
    }
}

class StudentManager {
    private Student[] students;
    private int studentCount;

    public StudentManager(int capacity) {
        students = new Student[capacity];
        studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Cannot add more students");
        }
    }

    public void displayAllStudents() {
        System.out.println("----- Student List -----");
        for (int i = 0; i < studentCount; i++) {
            students[i].displayStudentDetails();
        }
    }
}
