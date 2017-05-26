package hagai.edu;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //        treeSetDemo();

        Map<String , Contact> map = new HashMap<>();
        map.put("Moe" , new Contact("Moe" , "Green", "050675889"));//android Shared prefs , Bundle , Intend (Bundle)

        Map <String , Contact> tree = new TreeMap<>();
        tree.put("A" , new Contact("Dave" ,"D","D"));
        tree.put("C" , new Contact("Gil" ,"D","D"));
        tree.put("B" , new Contact("Aba" ,"D","D"));

        for (String s : tree.keySet()){
            System.out.println(s);
            System.out.println(tree.get(s));

        }


    }

    //Must implement comparable

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
