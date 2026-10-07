package Java.Chapter06.List;

import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volov");
        cars.add("BMw");
        cars.add("Ford");
        cars.add("Mazda");
        for (String i : cars){
            System.out.println(i);
        }
    }
}
