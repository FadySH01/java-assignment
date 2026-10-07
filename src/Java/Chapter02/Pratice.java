package Java.Chapter02;

class Pratice{

    private String name;
    private int age;
    private String grade;

    public String getName() {
        return name;
    }
    public void setName(String newName){
            name = newName;
        }

        public int getAge() {
            return age;

        }
       public void setAge(int newAge){
        if (newAge > 0);
        age = newAge;
        }

        public String getGrade(){
        return grade;
        }
public void setGrade(String newGrade){
        grade = newGrade;
}

    public static void main(String[] args) {
        Pratice p1 = new Pratice();
        p1.setName("John");
        p1.setAge(18);
        p1.setGrade("A");

        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Grade:" + p1.getGrade());

    }



    }



