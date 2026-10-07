package Java.Chapter02.Inheritance;

 class Person2 {
     String name;
     int age;

     Person2(String name,int age){
         this.name = name;
         this.age = age;
         System.out.println("Person Constructor called for" + name );
     }

     void displayPerson(){
         System.out.println("Name: " + name + ",Age: " + age);
     }
 }
 //First level child
 class Employee extends Person2{
     String department;

     Employee(String name, int age, String department){
         super(name,age);
         this.department = department;
         System.out.println("Employee constructor called for" + name);
     }

     void displayEmployee(){
         displayPerson();
         System.out.println("Department:" + department);
     }
 }

 //Second Level Child
class Manager extends Employee{
     double salary;

     //Constructor for Manager
 Manager(String name, int age, String department, double salary){
     super(name, age, department);
     this.salary = salary;
     System.out.println("Manager constructor called for " + name);
 }

 void displayManager(){
     displayEmployee();
     System.out.println("Salary: $" + salary);
 }
 }

 class Main2{
     public static void main(String[] args) {
         Manager m1 = new Manager("Micheal", 35, "IT,", 85000);
         System.out.println("\n--- Manager Details---");
         m1.displayManager();
     }
 }