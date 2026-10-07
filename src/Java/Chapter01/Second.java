package Java.Chapter01;

public class Second{
    // Fields (attributes)
             String brand = "Toyota";
             String color = "Blue";
             int year =  2025;

             //Constructor (used to create objects)
             // Method (behaviour)
             public void startEngine(){
                 
             }

             //Method to display car info
             public void displayInfo (){
                 System.out.println("Brand:" + brand);
                 System.out.println("Color:" + color);
                 System.out.println("Year:" + year);
                 //Main method (entry point of the program)
             }

    public static void main(String[] args) {
                 Second s = new Second();
                 s.startEngine();
                 s.displayInfo();
        
    }
        }


