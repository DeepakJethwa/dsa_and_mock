class List {
    static Node head1;
    static class Node {
        int data1;
        Node nex;
        Node(int d1)
        {
            data1 = d1;
            nex = null;
        }
    }
    // A recursive function to reverse the linked list
    Node reverse(Node current, Node previous)
    {
//Last node is marked as head
        if (current.nex == null) {
            head1 = current;
//previous node is updated with next
            current.nex = previous;
            return head1;
        }
//current.nex node is saved for the recursive call
        Node nex1 = current.nex;
//nex is updated
        current.nex = previous;
        reverse(nex1, current);
        return head1;
    }
    // Content of the reversed linked list are printed
    void printL(Node node)
    {
        while (node != null) {
            System.out.print(node.data1 + " ");
            node = node.nex;
        }
    }
    public static void main(String[] args)
    {
        List list = new List();
        list.head1 = new Node(20);
        list.head1.nex = new Node(30);
        list.head1.nex.nex = new Node(40);
        list.head1.nex.nex.nex = new Node(50);
        list.printL(head1);
//Function to reverse the list is called here
        Node result = list.reverse(head1, null);
        System.out.println("");

        list.printL(result);
    }
}