package Java.Pratice;

public class StudentExercise {
   private String name;
    private int age;
    private char grade;

    public String getName() {
        return name;
    }
        public void setName(String name){
            this.name = name;
        }

        public int getAge(){
        return age;
        }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
        else {
            System.out.println("Inalid age. Age must be greater than 0.");
        }
    }
    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'E' || grade == 'F') {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. Must be A,B,C,D,E,F");
        }
    }
    public static void main(String[] args) {
        StudentExercise E1 = new StudentExercise();
        E1.setName("Fady");
        E1.setAge(19);
        E1.setAge('A');

        System.out.println(" ");
        System.out.println("Student Details:");
        System.out.println("Name: " + E1.getName());
        System.out.println("Age : " + E1.getAge());
        System.out.println("Grade :" + E1.getGrade());
        System.out.println(" Excellent Result");


    }
}

