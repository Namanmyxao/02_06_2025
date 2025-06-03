package org.example;


import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map;


public class StudentService {
    Scanner scanner = new Scanner(System.in);
    Map<String,Student> mapStudents = new HashMap<>();
    private String code;

    public void addStudent(){
        System.out.print("Enter studentCode:");
        String studentCode = scanner.nextLine();
        System.out.print("Enter name:");
        String name = scanner.nextLine();
        System.out.print("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter major:");
        String major = scanner.nextLine();
        System.out.print("Enter GPA:");
        double GPA = Double.parseDouble(scanner.nextLine());
        GpaClassifier rank = new GpaClassifier();
        String Classify = rank.classify(GPA);
        mapStudents.put(studentCode, new Student(studentCode, name, age, major, GPA, Classify));
    }

    public Student findStudentByCode(String code){
        return mapStudents.get(code);
    }

    public void deleteStudent(String code){
        mapStudents.remove(code);
    }

    public List<Student> getAllStudents(){
        return mapStudents.values().stream().toList();
    }
}