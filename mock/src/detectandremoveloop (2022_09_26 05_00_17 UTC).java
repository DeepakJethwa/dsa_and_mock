import java.util.*;
class linkedlist {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next =null;
        }
    }



    void push(int newdata){
        Node new_node = new Node( newdata);
        new_node.next = head;

        head = new_node;
    }

    public static void main(String[] args){
        linkedlist list = new linkedlist();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        list.push(a);
        int b = sc.nextInt();
        list.push(b);
        int c = sc.nextInt();
        list.push(c);
        int d = sc.nextInt();
        list.push(d);
        int e = sc.nextInt();
        list.push(e);
        int f= sc.nextInt();
        list.push(f);
        int g = sc.nextInt();
        list.push(g);




    }

}
