package Java.Chapter02;

public class ConstructorExample2 {
    String name;
    int age;
    String course;

    //No-arg constructor
    ConstructorExample2(){
        System.out.println("hey");
    }
    //One-arg constructor
    ConstructorExample2(String name){
        this.name = name;
        this.age = 0;//default age
        this.course = "Not Assigned";
    }
    //Two-arg constructor
    ConstructorExample2(String name, int age){
        this.name = name;
        this.age = age;
        this.course = "Not Assigned";
    }

    //Three-arg constructor
    ConstructorExample2(String name, int age, String course){
        this.name = name;
        this.age = 0;//default age
        this.course = course;
    }

    public static void main(String[] args) {
ConstructorExample2 s1 = new ConstructorExample2();
ConstructorExample2 s2 = new ConstructorExample2("Amos");
ConstructorExample2 s3 = new ConstructorExample2("John", 20,"Java");
ConstructorExample2 s4 = new ConstructorExample2("Alice", 22, "Computer Science");

        System.out.println(s1.name + "-" + s1.age + "-"+ s1.course);
        System.out.println(s2.name + "-" + s2.age + "-" + s2.course);
        System.out.println(s3.name + "-" + s3.age + "-" + s3.course);
        System.out.println(s4.name + "-" + s4.age + "-" + s4.course);
    }
}
