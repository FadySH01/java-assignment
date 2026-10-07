package Java.Chapter05.Immutable;

public class Immutable2 {
    public static void main(String[] args) {
        String word = "Java";
        System.out.println("Before change:" + word);

        word = word.concat("Programming");

        System.out.println("After concat:" + word);
        System.out.println(word.concat("java new student" + "are welcome"));

    }
}
