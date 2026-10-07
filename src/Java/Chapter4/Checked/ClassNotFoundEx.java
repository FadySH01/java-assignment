package Java.Chapter4.Checked;

public class ClassNotFoundEx {
    public static void main(String[] args) {
        try{
            Class.forName("Java.Chapter02.Encapsulation.Person");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found:" + e.getMessage());
        }
    }
}
