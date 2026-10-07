package Java.Chapter02;

public class Student {
    String name;
    int rollNumber;
    int grade;

    public Student() {
        this.name = "Unknown";
        this.rollNumber = 0;
        this.grade = 'N';
    }

    public Student(String name, int rollNumber, int grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public void displayInfo(){
         System.out.println("Name: " + name);
         System.out.println("rollNumber:" + rollNumber);
         System.out.println("Grade "+ grade);
        System.out.println();
    }

    public static void main(String[] args) {
        Student S1 = new Student("Unknown", 0, 'N');
        Student S2 = new Student("Aisha", 101, 'A');

        S1.displayInfo();
        S2.displayInfo();
    }

    }