package hagai.edu;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getNames();

    }
    public  static Deque<String> getNames (){
        //very bad for random access
        Deque<String> names = new LinkedList<>();


        names.add("Codee");
        names.add("Mike");
        names.add("Dave");
        names.add("Moe");
        names.add("Moana");
        names.offer("Moana");

        System.out.println(names.peek());//codee - only a peel
        System.out.println(names.element());//codee  - retrieve but doesn't remove or exception
        System.out.println(names.poll());//codee - look and remove or null
        System.out.println(names.remove());//mike - remove or exception

        //Deque
        names.pop();//remove element or throw
        names.push("Mira");//push




        return names;

    }
}
