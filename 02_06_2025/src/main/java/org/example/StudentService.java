package org.example;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class StudentService {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();
    HashMap<String, String> mapStudents = new HashMap<>();
    public void addStudent(Student student){
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

        students.add(new Student(studentCode, name, age, major, GPA, Classify));
        mapStudents.put(studentCode, name);
    }

    public String findStudentByCode(String code){
        return mapStudents.get(code);
    }

    public void deleteStudent(String code){
        mapStudents.remove(code);
    }

    public ArrayList<Student> getAllStudents(){
        return students;
    }
}