package Java.Project;

abstract class Person {
    private String name;
    private int age;

    Person (String name, int age){
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
    private int[] grades;

    Student(String name, int age, int[] grades) {
        super(name, age);
        this.grades= grades;
    }
    public int [] getGrades() {
        return grades;
    }
    public void setGrades(int [] grades) {
        this.grades = grades;
    }
    public void calculateAverage() {
        int sum = 0;
        for (int i = 0; i < 5; i++,i++) {
            sum += grades[i];
        }
    }
    @Override
    void displayDetails() {
        System.out.println("Student Details");
        System.out.println("Name:" + getName());
        System.out.println("Int:" + getAge());
        System.out.println("Grade:");
        for(int g: grades){
            System.out.println(g + " ");
        }
    }
}

class Teacher extends Person{
    private String [] Subject;

    Teacher(String name, int age, String[] Subject) {
        super(name, age);
        this.Subject= Subject;
    }
    public String [] getSubject(){
        return Subject;
    }
    public void setSubject(String[] subject) {
        Subject = subject;
    }
     void listSubjects() {
            System.out.println("Subject taught");
            System.out.println("Maths, English,");

        }

    @Override
    void displayDetails(){
        System.out.println(" ");
        System.out.println("Teacher Details");
        System.out.println("Name:" + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Subject: JAVA");
        System.out.println("   ");
    }
}

 class Main{
    public static void main(String[] args) {
        Person[] P1 = new Person[3];

        P1[0] = new Student("Olagunju Fadilulah Abidemi", 19, new int[]{86,99,100});
        P1[1] = new Teacher("Mr.Prosper", 20, new String[]{ "Java"});
        P1[2] = new Student("Abidemi", 30, new int[]{70,60,96});

        for(Person p: P1){
            p.displayDetails();
        }


    }
}