import java.util.Scanner;
class linkedlist {
    node head = null;
    static class node{
        int val;
        node next;

        public node(int val){
            this.val = val;
        }
}

    node sortedMerge(node a, node b) //2
    {
        node result = null;
        if (a == null)
            return b;
        if (b == null)
            return a;

        if (a.val <= b.val) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
    node mergeSort(node h){
        if (h == null || h.next == null) {
            return h;
        }

        node middle = getMiddle(h);
        node nextofmiddle = middle.next;

        middle.next = null;

        node left = mergeSort(h);

        node right = mergeSort(nextofmiddle);

        node sortedlist = sortedMerge(left, right);
        return sortedlist;
    }

    public static node getMiddle(node head)
    {
        if (head == null)
            return head;

        node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

        void push(int new_data)
    {

        node new_node = new node(new_data);


        new_node.next = head;


        head = new_node;
    }


    void printList(node headref)
    {
        while (headref != null) {
            System.out.print(headref.val + " ");
            headref = headref.next;
        }
    }
        public static void main(String[] args)
    {

        linkedlist li = new linkedlist();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        li.push(a);
        int b = sc.nextInt();
        li.push(b);
        int c = sc.nextInt();
        li.push(c);
        int d = sc.nextInt();
        li.push(d);
        int e = sc.nextInt();
        li.push(e);


//        // Apply merge Sort
        li.head = li.mergeSort(li.head);
        li.printList(li.head);
    }
}




//class linkedList {
//    node head = null;
//    static class node {
//        int val;
//        node next;
//
//        public node(int val)
//        {
//            this.val = val;
//        }
//    }
//
//    node sortedMerge(node a, node b) //2
//    {
//        node result = null;
//        if (a == null)
//            return b;
//        if (b == null)
//            return a;
//
//        if (a.val <= b.val) {
//            result = a;
//            result.next = sortedMerge(a.next, b);
//        }
//        else {
//            result = b;
//            result.next = sortedMerge(a, b.next);
//        }
//        return result;
//    }
//
//    node mergeSort(node h)
//    {
//        if (h == null || h.next == null) {
//            return h;
//        }
//
//        node middle = getMiddle(h);
//        node nextofmiddle = middle.next;
//
//        middle.next = null;
//
//        node left = mergeSort(h);
//
//        node right = mergeSort(nextofmiddle);
//
//        node sortedlist = sortedMerge(left, right);
//        return sortedlist;
//    }
//
//    public static node getMiddle(node head)
//    {
//        if (head == null)
//            return head;
//
//        node slow = head, fast = head;
//
//        while (fast.next != null && fast.next.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//
//    void push(int new_data)
//    {
//
//        node new_node = new node(new_data);
//
//
//        new_node.next = head;
//
//
//        head = new_node;
//    }
//
//
//    void printList(node headref)
//    {
//        while (headref != null) {
//            System.out.print(headref.val + " ");
//            headref = headref.next;
//        }
//    }
//
//    public static void main(String[] args)
//    {
//
//        linkedList li = new linkedList();
//
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        li.push(a);
//        int b = sc.nextInt();
//        li.push(b);
//        int c = sc.nextInt();
//        li.push(c);
//        int d = sc.nextInt();
//        li.push(d);
//        int e = sc.nextInt();
//        li.push(e);
//
//        /*
//         * Let us create a unsorted linked list to test the functions
//         * created. The list shall be a: 2->3->20->5->10->15
//         */
////        li.push(15);
////        li.push(10);
////        li.push(5);
////        li.push(20);
////        li.push(3);
////        li.push(2);
//
//        // Apply merge Sort
//        li.head = li.mergeSort(li.head);
//        li.printList(li.head);
//    }
