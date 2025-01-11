package dsaalgo;

import org.w3c.dom.*;

public class Linklist {
    private Node head;
    private Node tail;

    private int size;


    public Linklist() {
        this.size = 0;
    }
    public void insertFirst(int value) {
            Node node = new Node(value);
             node.next = head;

            head =node;

            if(tail == null){
                tail = head;
            }
            size += 1;
}

public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
        }
        Node node = new Node(val);
                tail.next = node;
          tail = node;
          size++;
}
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val +"->");

            temp = temp.next;
        }
        System.out.println("End the program");

    }

    private class Node {

     private int val;             // create a node
    private Node next;

    public Node(int val){
        this.val = val;

    }

    public Node(int val, Node next){

        this.val = val;
        this.next = next;

    }

    
}
}