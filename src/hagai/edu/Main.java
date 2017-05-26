package hagai.edu;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        treeSetDemo();

    }
    //set methods
    //add remove

    public  static void treeSetDemo (){

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
    public  static void hashSetDemo (){

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
