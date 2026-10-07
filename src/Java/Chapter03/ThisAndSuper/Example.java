package Java.Chapter03.ThisAndSuper;

public class Example {
        public void someMethod() {
            System.out.println("Method in Example class");
        }
    }
    class NewExample extends Example {
        public void someMethod() {
            System.out.println("Method in New Example class");
        }
        public void anotherMethod() {
            this.someMethod();
            super.someMethod();
        }

        public static void main(String[] args) {
            NewExample obj = new NewExample();
            obj.anotherMethod();
        }
    }