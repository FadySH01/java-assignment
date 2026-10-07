package Java.Chapter4.Checked.Throwable;

public class AgeChecker {

    public void checkAge(int age)throws Exception{
        if(age< 18){
            throw new Exception("Age must be 18 or above");
        }
        System.out.println("Access granted");
    }

    public static void main(String[] args) {
        AgeChecker checker = new AgeChecker();


        try{
            checker.checkAge(16);
        } catch (Exception e) {
            System.out.println("Caught Exception:" + e.getMessage());
        }
        System.out.println("Program continue... ");
    }
}
