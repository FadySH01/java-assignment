package Java.Chapter4.UnChecked;

public class ClassCastExample {

        public static void main(String[] args) {
            try {
                Object text = "Hello";
                Integer num = (Integer) text; // Invalid cast
            }catch (ClassCastException e){
                System.out.println(e.getMessage());
            }
        }

    }

