import java.util.*;
class findthemiddileofthelinkedlist {
    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static int countOfNodes(Node head)
    {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    public static Node deleteMiddleElement(Node head)
    {
        // Base cases
        if (head == null)
            return null;
        if (head.next == null) {
            return null;
        }
        Node copyHead = head;

        // Find the count of nodes
        int count = countOfNodes(head);

        // Find the middle node
        int mid = count / 2;

        // Delete the middle node
        while (mid-- > 1) {
            head = head.next;
        }


        // Delete the middle node
        head.next = head.next.next;

        return copyHead;
    }

    /* Function to print middle of linked list */
    void printMiddle(Node head)
    {
        Node slow_ptr = head;
        Node fast_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null)
        {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        System.out.println("The middle element is [" +
                slow_ptr.data + "] \n");

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
            findthemiddileofthelinkedlist list = new findthemiddileofthelinkedlist();
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
           list.printMiddle(head);

            System.out.println("Given Linked list");
            list.printList(head);
            System.out.println("");

        }
    }
}