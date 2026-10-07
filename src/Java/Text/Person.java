package Java.Text;

public abstract class Person {
     private String name;
     private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
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

   abstract void displayDetails();

 }


 class Student extends Person{
    private String course;

     public Student(String name, int age, String course) {
         super(name, age);
         this.course = course;
     }
     public String getCourse() {
         return course;
     }

     public void setCourse(String course) {
         this.course = course;
     }
     @Override
     void displayDetails() {
     }
     void displayDetails(String name) {
         System.out.println();
     }

     void displayDetails(String name, int age) {
         System.out.println("My"+ name);
         System.out.println("My name is" +name + "and my age is" + age);
     }
 }

 class Teacher extends Person{
    private String Subject;

     public Teacher(String name, int age, String subject) {
         super(name, age);
         Subject = subject;
     }

     public String getSubject() {
         return Subject;
     }

     public void setSubject(String subject) {
         Subject = subject;
     }

     @Override
     void displayDetails() {
     }
     void displayDetails(String name) {
         System.out.println();
     }

     void displayDetails(String name, int age) {
         System.out.println("My"+ name);
         System.out.println("My name is" +name + "and my age is" + age);
     }
 }

 class mainmethod {
     public static void main(String[] args) {
         Student S1 = new Student("Fady", 22, "MMS");
         Teacher T1 = new Teacher("Fady", 22, "Java");
         S1.setName("Fady");
         S1.setAge(22);
         S1.setCourse("MMS");
         T1.setName("Fady");
         T1.setAge(22);
         T1.setSubject("Java");
         System.out.println("My" + S1.getName());
         System.out.println("My name is" + S1.getName() + "and my age is" + S1.getAge());
         System.out.println("My" + T1.getName());
         System.out.println("My name is" + T1.getName() + "and my age is" + T1.getAge());


     }
 }