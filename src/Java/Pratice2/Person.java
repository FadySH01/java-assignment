package Java.Pratice2;

import java.sql.Array;

public abstract class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age= age;
    }
    abstract void displayinfo();
}
class Student extends Person {
    int StudentId;
    String course;

    Student(String name, int age, int StudentId, String course) {
        super(name, age);
        this.StudentId = StudentId;
        this.course = course;
    }

    @Override
    void displayinfo() {
        System.out.println("Student name" + name);
        System.out.println("Student age" + age);
        System.out.println("StudentID" + StudentId);
        System.out.println("Student Course" + course);
    }
}

class Teacher extends Person implements Payable{
    String Subject;
    int Salary;

    Teacher(String name, int age, String Subject, int Salary){
        super(name, age);
        this.Subject = Subject;
        this.Salary = Salary;
    }

    @Override
    void displayinfo() {
        System.out.println("Student name" + name);
        System.out.println("Student age" + age);
        System.out.println("StudentID" + Subject );
        System.out.println("Student Course" + Salary);
    }
    @Override
    public int calculatePay() {
        return Salary * 12;
    }
}

interface Payable{
    int calculatePay();
}

class School{
    Student a = new Student("Fadilulah Abidemi", 19, 132467, "Software Engineering(MMS)");
    Teacher b = new Teacher("Mr. Prosper", 21, "Java", 280000);
   Student[] arr1 = new Student[3];
   Teacher[] arr2 = new Teacher[3];
}




