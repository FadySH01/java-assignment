package Java.Chapter4.UnChecked;

public class ExceptionExample1 {
    public static void main(String[] args) {int a = 10;
        int b = 0;
        int result;

        try{
            result = a/b;
        } catch (ArithmeticException e){
            System.out.println("Error: Cannot divide a number  by zero");
        }finally {
            System.out.println("Execution Completed.");
        }
    }
}
