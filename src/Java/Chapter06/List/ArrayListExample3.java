package Java.Chapter06.List;

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volov");
        cars.add("BMw");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
