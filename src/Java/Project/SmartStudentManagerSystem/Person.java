package Java.Project.SmartStudentManagerSystem;

import java.util.Random;

public class Person {
    private String name;
    private int age;
    private String gender;


    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    void displayInfo(){
        System.out.println("---Personal Details ----");
        System.out.println("My name is " +  name);
        System.out.println("My age is" + age);
        System.out.println("My gender is " + gender);
    }
}

class Student extends Person {
    int StudentId;
    String department;
    Double GPA;
    String institution;
    static int Total;

    Student(String name, int age, String gender, int StudentId, String department, Double GPA, String institution) {
        super(name, age, gender);
        this.department = department;
        this.GPA = GPA;
        this.StudentId = StudentId;
        this.institution = institution;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("--Student Details---");
        System.out.println("My department is " + department);
        System.out.println("My Course GPA is " + GPA);
        System.out.println("My StudentID num is " + StudentId);
        System.out.println("My institution name is " + institution);
    }

    void calculateGPA() {
        int average = Total;
        System.out.println("Student Average Score is " + average);
    }

    void enrollCourse() {
        String acept = "Male";
        if (acept == "Male") {
            System.out.println("Enroll your Student in our Prestigious Organization");
        }else{
            System.out.println("Not Space for admisssion");
        }
        System.out.println("Choice made");
    }
}

class Department{
   private String departmentname;
    private String HODName;
    private int numberOfStudent;

    Department(String departmentname, String HODName, int numberOfStudent){
        this.departmentname = departmentname;
        this.HODName = HODName;
        this.numberOfStudent = numberOfStudent;
    }
    String getDepartmentname(){
        return departmentname;
    }
    void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }
    String getHODName() {
        return HODName;
    }
    void setHODName(String HODName) {
        this.HODName = HODName;
    }
    int getNumberOfStudent() {
        return numberOfStudent;
    }
    void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }
    void displayDeptInfo(){
        System.out.println("--- Department Details");
        System.out.println("My department name is "+ departmentname);
        System.out.println("My HOD name is" + HODName);
        System.out.println("The Number of student in my department is" + numberOfStudent);
    }
}

abstract class Evaluation{
    abstract void calculateGrade();
}

interface Printable{
     default void printDetails(){
         System.out.println("Fady typed the code");
    }
}

class Course extends Evaluation implements Printable{
    String courseCode;
    String courseTitle;
    String creditHour;
    int grades;
    @Override
    void calculateGrade() {
    }
    @Override
    public void printDetails() {
        Printable.super.printDetails();
    }
}
 class StudentManager{
     public static void main(String[] args) {
         
     }
 }