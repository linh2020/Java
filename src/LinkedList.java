//public class LinkedList {
//    Node head = null;
//
//    static class Node {
//        int data;
//        Node next; //by default -> null
//
//        //constructor
//        Node(int d) {
//            this.data = d;
//            Node next = null;
//        }
//    }
//
////    public void printList() {
////        Node tmp = head;
////        while (tmp != null) {
////            System.out.print(tmp.data + " -> ");
////            tmp = tmp.next;
////        }
////        System.out.print("null");
////    }
//
//    public void printList() {
//        Node tmp = head;
//        while (tmp != null) {
//            System.out.print(tmp.data + " -> ");
//            tmp = tmp.next;
//        }
//        System.out.print("null");
//    }
//
//    public void insertLastNode(int data) {
//        Node newNode = new Node(data);
//        Node tmp = head;
//        while (tmp.next != null) {
//            tmp = tmp.next;
//        }
//        tmp.next = newNode;
//    }
//
//    public void insertFirstNode(int data) {
//        Node newNode = new Node(data);
//        Node tmp = head;
//        head = newNode;
//        newNode.next = tmp;
//    }
//
//    public void insertAt(int data, int index) {
//        Node newNode = new Node(data);
//        Node tmp = head;
//        Node tmp2;
//
//        while (tmp.next != null && tmp.data != index) {
//            tmp = tmp.next;
//        }
//        tmp2 =tmp;
//        tmp.next = newNode;
//        newNode.next = tmp2;
////        tmp.next = newNode;
//    }
//
//
//    public static void main(String[] args) {
//        Node first = new Node(1);
//        Node second = new Node(2);
//        Node third = new Node(3);
//
//        LinkedList ll = new LinkedList();
//        ll.head = first;
//        ll.head.next = second;
//        second.next = third;
//
////        ll.head = null;
//
////        ll.insertLastNode(4);
//        ll.insertLastNode(5);
//        ll.insertFirstNode(0);
//        ll.insertLastNode(6);
//        ll.insertLastNode(7);
//
////        ll.insertFirstNode(0);
//////        ll.insertFirstNode(-1);
//////        ll.insertFirstNode(-2);
////        ll.insertAt(4,5);
//        ll.printList();
//
//
////        System.out.println(ll.head.data + " " + ll.head.next.data + " " + ll.head.next.next);;
//    }
//
//
//}

public class LinkedList {
    Node head = null;

    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void printList() {
        while (this.head != null) {
//            System.out.print((this.head != null) ? this.head.data + " -> " : "null");
            System.out.print(this.head.data + " -> ");
            this.head = this.head.next;
        }
        if (this.head == null)
            System.out.println("null");
    }

    public void insertHeadNode(int data) {
        Node newNode = new Node(data);

        if (this.head == null)
            this.head = newNode;
        else {
            Node tmp = this.head;
            this.head = newNode;
            this.head.next = tmp;   // similar to newNode.next = tmp;
        }
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

//        Node n1 = new Node(1);
//        Node n2 = new Node(2);
//        Node n3 = new Node(3);
//
//        ll.head = n1;
//        ll.head.next = n2;
//        n2.next = n3;

        ll.printList();

        ll.insertHeadNode(5);
        ll.insertHeadNode(4);
        ll.insertHeadNode(3);

//        System.out.println(ll.head.data);

        ll.printList();


//        System.out.println(ll.head.next.data);
//        System.out.println(n1);
//        System.out.println();


    }
}


// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> null -> null
// 1 -> null
// null

//12345


