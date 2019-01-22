import java.util.*;

public class LinkedList {
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int data) {
            this.value = data;
        }

    }
    public static void main(String[] args) {


        java.util.LinkedList<Node> list = new java.util.LinkedList<>();


        LinkedList name = new LinkedList();

        name.head = new Node(1);
        Node second = new Node(2);
        name.head.next = second;       //link head with second node
        Node third = new Node(3); //create third node
        second.next = third; //link 2nd node with 3rd node

        list.add(name.head);
        list.add(second);
        list.add(third);

        //System.out.println(third.next); // no third node, return null.
        //System.out.println(name.head.next.value); // return value of node that connects to head
        //System.out.println(list.size()); // size of linked list
        //System.out.println(list.getLast().value); // get last value in linked list

        for(int i = list.size()- 1; i >= 0; i--){ //reverse iteration
            System.out.println(list.get(i).value);
        }
        System.out.println("\n");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).value); //
        }

    }
}
