package Java.Chapter02.Encapsulation;

class Person {
        //Step 1: Make fields private (hidden)
        private String Name;
        private int age;

        //provide public(getter and setters)
        public String getName(){
            return Name; //allows us to READ the name
    }
public void setName (String newName){
           Name = newName; //allow us to CHANGE the name
}

public int getAge() {
            return age;// allow us to READ the age
}

public void setAge(int newAge) {
    if (newAge > 0) {// simple validation
        age = newAge;
    }
}
//main method in the SAME class
public static void Main(String[] args) {
            Person p1 = new Person();
            p1.setName("John");
            p1.setAge(25);

    System.out.println("Name:" + p1.getName());
    System.out.println("Age:" + p1.getAge());
    }
}

class Person2{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name= newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if(newAge>0){
            age= newAge;
        }
    }
}

//main method in a DIFFERENT class
class Main{
    public static void main(String[] args) {
        Person2 p1 = new Person2();

        p1.setName("John");
        p1.setAge(25);

        System.out.println("Name:" + p1.getName());
        System.out.println("Age:" + p1.getAge());
    }
}