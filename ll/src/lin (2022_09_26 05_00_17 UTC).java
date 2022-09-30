import java.util.*;
class lin {
    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int n = sc.nextInt();
            lin list = new lin();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }

//            public static void main(String args[])
//            {
//                Main llist = new Main();
//                llist.push(1);
//                llist.push(2);
//                llist.push(3);
//                llist.push(2);
//                llist.push(1);

                System.out.println("Given Linked list");
            list.printList(head);
            System.out.println("");

        }
    }
}