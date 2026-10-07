package Java.Pratice;

 abstract class EmployeeExercise2 {
    private String name;
    private double salary;

    public EmployeeExercise2 (String name, double salary){
        this.name = name;
        this.salary = salary;
    }
     void work(){
         System.out.println("Perserverance");
     }

     void work (int hours){
         System.out.println("FadySH worked for " + hours + "hours.");
     }

     abstract void calculateBonus();

     public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
        public void setSalary(double salary) {
            if (salary >= 0) {
                this.salary = salary;
            } else {
                System.out.println("Salary cannot be negative.");
            }
        }

    }

    class Manager extends EmployeeExercise2{
    String department;

    Manager(String name, double salary, String department){
        super(name,salary);
        this.department = department;
        }

        @Override
        void work() {
            super.work();
            System.out.println("FadySH");
        }

        @Override
        void work(int hours) {
            super.work(hours);
            System.out.println("Priscillia worked for :" + hours + "hours");
        }

        @Override
        void calculateBonus() {
            System.out.println("Ahmad Salary Bonus");
        }
    }


    class Developer extends EmployeeExercise2{
    String programmingLanguage;

    Developer (String name, double salary, String programmingLanguage){
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

        @Override
        void work() {
            super.work();
            System.out.println("Olagunju Fadilulah Abidemi");
        }

        @Override
        void work(int hours) {
            super.work(hours);
            System.out.println("Ahmad worked:" + hours + "hours");
        }

        @Override
        void calculateBonus() {
            System.out.println("Real salary Bonus");
        }
    }

    class main{
        public static void main(String[] args) {
            EmployeeExercise2 E1 = new Manager("Fadilulah", 3400.00, "Software Engineering");
            Developer E2 = new Developer("Abidemi", 6500.0, "JAVA");

            E1.work();
            E1.work();
            E1.calculateBonus();

            E2.work();
            E2.work();
            E2.calculateBonus();
        }


 }
