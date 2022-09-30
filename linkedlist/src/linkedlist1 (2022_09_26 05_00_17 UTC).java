import java.util.*;
class LL {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        return;
    }
        newNode.next = head;
        head = newNode;
    }
    public void printlist(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data+ " ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        LL list = new LL();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(150);
        list.printlist();
        list.printlist();

    }
}