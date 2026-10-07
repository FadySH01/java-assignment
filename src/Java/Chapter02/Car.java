package Java.Chapter02;

public class Car {
    String model;
    int year;
    static String manufacturer;

    public Car(String model, int year, String manufacture) {
        this.model = model;
        this.year = year;
        manufacturer = manufacturer;
    }

    static void first() {
        System.out.println("manufacturer:" + manufacturer);
    }

    void second() {
        System.out.println("model: " + model + "year: " + year);
    }

   void third() {
        System.out.println("year: +." + year);
    }

    public class Main {
        public static void main(String[] args) {
            Car Fady = new Car("FADY", 2020, "Toyota");
        }

    }

}