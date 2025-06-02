package org.example;

public class Student {
    private String studentCode;
    private String name;
    private int age;
    private String major;
    private double GPA;
    private String Classify;
    public Student(String studentCode, String name, int age, String major, double GPA, String Classify){
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
        this.major = major;
        this.GPA = GPA;
        this.Classify = Classify;
    }

    public String get_studentCode(){ return studentCode; }
    public String get_name(){ return name; }
    public int get_age(){ return age; }
    public String get_major(){ return major; }
    public double get_GPA(){ return GPA; }
    public String get_Classify(){return Classify;}

    public void setStudentCode(String studentCode){ this.studentCode = studentCode; }
    public void setName(String name){ this.name = name; }
    public void setAge(int age){ this.age = age; }
    public void setMajor(String major){ this.major = major; }
    public void setGPA(double GPA){
        if(GPA < 0.0 || GPA > 4.0){
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        this.GPA = GPA;
    }
    public void setClassify(double GPA){
        GpaClassifier rank = new GpaClassifier();
        this.Classify = rank.classify(GPA);
    }

    @Override
    public String toString(){
        return "Student code:" + studentCode + ", Name:" + name + ", Age:" +age+
                ", Major:" + major + ", GPA:" + GPA + ", Classify:" + Classify;
    }
}