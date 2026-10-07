package Java.Pratice2;

public class Ground {
    String name = "Fadilulah";

    String greetUser() {
        return "Hello," + name + "!WElcome";

    }
    public static void main(String[] args) {
        Ground B = new Ground();
        B.greetUser();
    }

}