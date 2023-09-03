// The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
// Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");

        System.out.println(car.get(1));
        // Add element between
        car.add(1, "naino");
        System.out.println(car);
        // set element
        car.set(0, "Honda");
        System.out.println(car);

        // delete element
        car.remove(2);
        System.out.println(car);
        // count element
        System.out.println(car.size());

        for (int i = 0; i < car.size(); i++) {
            System.out.println(car.get(i));
        }

        // sort
        Collections.sort(car);
        System.out.println(car);

    }
}