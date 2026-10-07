package Java.Chapter02.POLYMORPHISM;

class Vehicle {
        public void start() {
            System.out.println("Vehicle is starting");
        }
    }

    class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("Car is starting");
        }

        public void start(String mode) {
            System.out.println("Car is starting in " + mode + " mode");
        }
    }

    class Main {
        public static void main(String[] args) {
            Vehicle v = new Car();
            v.start();

            Car c = new Car();
            c.start();
            c.start("sport");
        }
    }