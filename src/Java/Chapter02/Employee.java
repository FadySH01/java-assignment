package Java.Chapter02;

public class Employee {

    static int id;
    String name;
    int age;

    public Employee(int idValue, String name, int age) {
        id = idValue;
        this.name = name;
        this.age = age;
    }

    public static void first () {
        System.out.println("ID:" + id);
    }

    public void second() {
        System.out.println("Name:" + name + ", Age: " + age);
    }

    public void third(){
        System.out.println( "age increased to: " + age);
    }

    public class Main {
        public static void main(String[] args) {
            Employee E1 = new Employee(1001, "Fadilulah", 19);

            Employee.first();
            E1.second();
            E1.third();
        }

    }
    
}