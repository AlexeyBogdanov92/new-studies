package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Toyota");
        list.add("Honda");
        list.add("Mazda");
        list.add("BMW");
        list.add("Opel");

        System.out.println(list);

        list.add(2, "Ford");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}
