package Java.Chapter02;

public class StudentWithConstructor {
    String name = "        ";
    int age;
     //No-argument constructor
    StudentWithConstructor() {
        System.out.println("No-arg constructor called");
    }

    public static void main(String[]args){
        StudentWithConstructor s1 = new StudentWithConstructor();
        System.out.println(s1.name + "-" + s1.age);
    }
}
