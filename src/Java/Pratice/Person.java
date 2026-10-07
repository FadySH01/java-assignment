package Java.Pratice;
abstract class Person {
     private String name;
     private int age;
     public Person(String name, int age){
         this.name = name;
         this.age = age;
     }
    public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     public int getAge(){
         return age;
     }
     public void setAge(int age){
       this.age = age;
     }
     abstract void displayInfo();
     void showRole(){
         System.out.println("Fady is a Trader");
     }
 }
 class Doctor extends Person implements Treatable{
   private String specialization;
  Doctor(String name, int age, String specialization){
      super(name, age);
      this.specialization = specialization;
  }
     public String getSpecialization() {
         return specialization;
     }
     public void setSpecialization(String specialization) {
         this.specialization = specialization;
     }
     @Override
     void displayInfo() {
         System.out.println("Doctor Name"+ getName());
         System.out.println("Age"+ getAge());
         System.out.println("Specialzation" + getSpecialization());
     }
     @Override
     public void treat() {
         System.out.println("Doctor is treating the Patient");
     }
     @Override
     public void checkup() {
         System.out.println("Nurse is doing some check-up on the patient");
     }
 }
 class Patient extends Person{
    private int patientID;
    Patient(String name, int age, int patientID){
        super(name, age);
        this.patientID = patientID;
    }
     public int getPatientID() {
         return patientID;
     }
     public void setPatientID(int patientID) {
         this.patientID = patientID;
     }
     @Override
     void displayInfo() {
         System.out.println("Patient name"+ getName());
         System.out.println("Patient age"+ getAge());
         System.out.println("PatientID" + getPatientID());
     }
     void calculateBill(double consultationFee, double medicineFee){
         double Total = consultationFee + medicineFee;
        System.out.println("Total Bill:N" + Total);
    }
 }
interface Treatable{
    void treat();
    void checkup();

    class Doctor implements Treatable{
        @Override
        public void treat() {
            System.out.println("The Doctor has start to treat the patient");
        }
        @Override
        public void checkup() {
            System.out.println("The Nurse Check up on me daily");
        }
    }
}

class HospitalMain {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr.Fady", 21, "Surgery");
        Patient p1 = new Patient("Gabriel", 19, 230094);
        d1.displayInfo();
        d1.showRole();
        d1.treat();
        d1.checkup();

        p1.showRole();
        p1.displayInfo();
        p1.calculateBill(9800.0, 8750.0);
        Person[] P1 = new Person[2];
        for (Person p: P1) {
            p.displayInfo();
        }
    }
}