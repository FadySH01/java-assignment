package Java.Chapter03.PackageEx1.Pacakge2;

import Java.Chapter03.PackageEx1.Package1.Person;

public class TestPerson extends Person {
        public static void main(String[] args) {
            TestPerson obj = new TestPerson();


            // public → accessible
            System.out.println("Name: " + obj.name);

            // protected → accessible in subclass (even across packages)
            System.out.println("Age: " + obj.age);

            // default → ❌ not accessible outside package1
            // System.out.println("City: " + obj.city); // ERROR

            // private → ❌ not accessible
            // System.out.println("Secret: " + obj.secret); // ERROR

            // but we can use public getter for private
            System.out.println("Secret via getter: " + obj.getSecret());
        }
    }

