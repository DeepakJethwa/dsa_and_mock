class ll {
    static Node head;
    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    // Search a element a linked list...............................................................................................
    public boolean search(Node head, int x)
    {
        Node current = head;
        while (current != null)
        {
            if (current.data == x)
                return true;
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args)
    {
        ll list = new ll();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(100);

        System.out.println("Given Linked list");
        list.printList(head);
        System.out.println("");
        if (list.search(list.head, 21))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
} 