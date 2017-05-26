package hagai.edu;

import java.util.Queue;

/**
 * Created by Hagai Zamir on 26-May-17.
 */
public class MyLinkedList {
    int count;
    Node head;


//add string data
    public MyLinkedList(String data) {
        Node n = new Node(data);
        if (count == 0){
            head = n;
        }
        else {
            head.next = n;
        }
    }

    public  void  add (String data){

    }
    public  String get (){
        return  null;
    }

    class  Node {
        Node next;
        String data;

        public Node(String data) {
            this.data = data;

        }
    }
}
