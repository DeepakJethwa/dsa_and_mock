class Node{
    int data;
    Node next;  // -> Object reference
}

class Main{
    public static void main(String args[]){
        Node head = new Node();
        /*
            (0, null)
        */
        Node second = new Node();
        second.data = 1;
        second.next = null;
        /*
            head = (0, null) |||| second = (1, null)
        */
        head.next = second;
        /*
            head = (0, Node@second) |||| second = (1, null)
        */

        Node third = new Node();
        third.data = 2;
        third.next = null;

        second.next = third;

        /*
            head = (0, Node@second) |||| second = (1, Node@middle) ||||  (2, null) ||| temp = null
        */
        Node middle = new Node();
        middle.data = 4;
        /*
            head = (0, Node@second) |||| second = (1, Node@third) ||||  (2, null) ||| temp = null
        */
        /*
            middle = (4, null)
        */

        middle.next = head.next; //insertion of middle node after second node
        head.next = middle;

        /*
            head = (0, Node@second) |||| second = (1, Node@middle) ||||  (2, null) ||| temp = null
        */
        /*
            middle = (4, Node@third)
        */

        head = head.next; //deletion of second node

        /*
        head = (0, Node@middle) |||| second = (1, Node@middle) ||||  (2, null) ||| temp = null
        */
        /*
            middle = (4, Node@third)
        */

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" "); //
            temp = temp.next;
        }
    }
}
