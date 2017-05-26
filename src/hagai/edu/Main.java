package hagai.edu;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //Stream ()....
        List<String> names = new ArrayList<>();
        names.add("Codee");
        names.add("Codee");
        names.add("Codee");
        names.add("Mike");
        names.add("Dave");
        names.add("Moe");
        names.add("Moana");

        //count all the names.length
        names.stream().map(String::length).reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer s, Integer i) {
                return s + i;

            }
        });

        names.stream().map(name -> new Contact(name, "", "")).forEach(System.out::println);

        names.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        }).forEach(System.out::println);

        // names.stream().filter(s -> s.startsWith("M")).forEach(System.out::println);
        //distinct , calls equals
        //sum using loop
        //int sum = 0 // identety
        //fori -> sun + arr[i] // accumulator

        names.stream().distinct().sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);
        {

        }
        names.stream().distinct().forEach(System.out::println);

        //terminal operations:
        Integer sums = Stream.of(1, 2, 3, 4, 5, 6).
                reduce(0, (sum, arri) -> sum + arri);

        Integer mult = Stream.of(1, 2, 3, 4, 5, 6).
                reduce(0, (m, arri) -> m + arri);

        //terminal operations:
        names.stream().distinct().filter(s -> s.contains("c")).count();

        Stream.of(1, 2, 3, 4, 5, 6).max((n1, n2) -> n1 - n2);

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                //return name1.compare to (name2);//ordinal.
                return name1.length() - name2.length();
            }
        });

        System.out.println(sums);

        {

        }


        // write your code here
        //        treeSetDemo();

        Map<String, Contact> map = new HashMap<>();
        map.put("Moe", new Contact("Moe", "Green", "050675889"));//android Shared prefs , Bundle , Intend (Bundle)

        Map<String, Contact> tree = new TreeMap<>();
        tree.put("A", new Contact("Dave", "D", "D"));
        tree.put("C", new Contact("Gil", "D", "D"));
        tree.put("B", new Contact("Aba", "D", "D"));

        for (String s : tree.keySet()) {
            System.out.println(s);
            System.out.println(tree.get(s));

        }


    }

    //Must implement comparable

    //set methods
    //add remove

    public static void treeSetDemo() {

        Set<String> names = new TreeSet<>();
        System.out.println(names.add("Codee"));//true
        System.out.println(names.add("Codee"));//false
        System.out.println(names.add("Codee"));//false
        System.out.println(names.add("Mike"));//true
        System.out.println(names.add("Dave"));//true
        System.out.println(names.add("Moe"));//true
        System.out.println(names.add("Moana"));//true

        names.forEach(System.out::println);


    }

    //set methods
    //add remove
    public static void hashSetDemo() {

        Set<String> names = new HashSet<>();
        System.out.println(names.add("Codee"));//true
        System.out.println(names.add("Codee"));//false
        System.out.println(names.add("Codee"));//false
        System.out.println(names.add("Mike"));//true
        System.out.println(names.add("Dave"));//true
        System.out.println(names.add("Moe"));//true
        System.out.println(names.add("Moana"));//true

        names.forEach(System.out::println);


    }


    private static void print(String s) {
        System.out.println(s);


    }


}
