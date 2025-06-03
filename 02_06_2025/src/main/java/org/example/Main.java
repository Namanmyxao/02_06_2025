package org.example;

import java.util.Scanner;

public class Main {
    private static final StudentService student = new StudentService();
    private static Scanner scanner = new Scanner(System.in);

    private static ExcelExporter file;

    public Main(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void main(String[] args){
        while (true){
            System.out.println("\n===== Student Manager Menu =====");
            System.out.println("1. Create Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Excel export");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1 -> student.addStudent();
                case 2 -> {
                    System.out.println(student.getAllStudents());
                }
                case 3 -> {
                    System.out.println("Enter student's code: ");
                    String code = scanner.nextLine();
                    System.out.println(student.findStudentByCode(code));
                }
                case 4 -> {
                    System.out.println("Enter student's code: ");
                    String code = scanner.nextLine();
                    student.deleteStudent(code);
                    System.out.println("Student deleted");
                }
                case 5 -> file.export(student.getAllStudents(), "C:/Users/hoang/OneDrive/Desktop");
                case 6 -> {
                    System.out.println("Goodbye");
                    return;
                }
                default -> System.out.println("Invalid option");

            }
        }
    }
}
