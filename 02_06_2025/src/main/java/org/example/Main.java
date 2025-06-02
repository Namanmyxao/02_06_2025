package org.example;

import java.util.Scanner;

public class Main {
    static StudentService stud1 = new StudentService();
    private static final Scanner scanner = new Scanner(System.in);
    private static Student Student;
    private static ExcelExporter file;
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
                case 1 -> stud1.addStudent(Student);
                case 2 -> stud1.getAllStudents();
                case 3 -> stud1.findStudentByCode(Student.get_studentCode());
                case 4 -> stud1.deleteStudent(Student.get_studentCode());
                case 5 -> file.export(stud1.getAllStudents(), "C:/Users/hoang/OneDrive/Desktop");
                case 6 -> {
                    System.out.println("Goodbye");
                    return;
                }
                default -> System.out.println("Invalid option");

            }
        }
    }
}
