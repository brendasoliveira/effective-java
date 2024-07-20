package FunctionalInterfaces.PredicateInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    //The Predicate Interface represents a funtion that takes an argument and returns a boolean
    //See below exemples using removeIf() and filter()
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(10);
        list.add(7);
        list.removeIf(item -> item % 2 != 0);
        list.stream().forEach(System.out::println);

        List<Integer> listFilter = Arrays.asList(3, 4, 5, 10, 7);
        listFilter.stream().filter(item -> item % 2 == 0).forEach(System.out::println);

    }

}
