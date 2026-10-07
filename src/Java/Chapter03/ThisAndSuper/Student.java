package Java.Chapter03.ThisAndSuper;

public class Student {
        private String name;
        private int age;
        public Student() {
            // calling another constructor in the same class
            this("john", 40);

            System.out.println("Default constructor called");
        }
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Parameterized constructor called");
        }
    }

    class Main {
        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student("Mike", 25);
        }
    }

