package Java.Chapter02.Inheritance;

//Parent class
public class Person {
    String name;

    Person(String name){
        this.name=name;
        System.out.println("Person constructor called:" + name);
    }
}

//child class
class Student extends Person {
    int studentid;

   Student(String name, int studentid){
       super(name);
       this.studentid = studentid;
       System.out.println("Student Constructor called with ID: " + studentid);
   }

   void fady(){
       System.out.println("Name:" + name + "Student ID:" + studentid);
   }
}

class Main1 {
    public static void main(String[] args) {
        Student s1 = new Student("Micheal", 101);
        s1.fady();
    }
}
