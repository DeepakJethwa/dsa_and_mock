import java.util.*;
class linkedl {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void printlist(Node node) {
        while (node != null){
            System.out.println(node.data +" ");
            node = node.next;
        }
    }
    public static void main(String[] args){
       linkedl list = new linkedl();
       list.head = new Node(1);
       list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next= new Node(4);
        list.printlist(head);
       head = list.reverse(head);
        System.out.println("");
        list.printlist(head);
    }
}


