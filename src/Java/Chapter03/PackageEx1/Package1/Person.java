package Java.Chapter03.PackageEx1.Package1;

public class Person {

        public String name = "Michael";
        protected int age = 30;
        String city = "Lagos";
        private String secret = "Hidden!";

        public String getSecret() {
            return secret;
        }

    }
    class Person2{
        public static void main(String[] args) {
            Person p=new Person();
            p.getSecret();
        }
    }

