import org.w3c.dom.Node;

public class LinkedList {
    Node head;

    static class Node {
        private int data;
        private Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    void addFirstNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        if (head == null) {
            System.out.println("Empty List");
        } else {
//            while (head != null) {
//                System.out.print(head.data + " -> ");
//                head = head.next;
//            }
            Node currentNode = this.head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
            System.out.println("null");
        }
    }


    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        LinkedList ll = new LinkedList();

        ll.addFirstNode(1);
//        ll.printList();

        ll.addFirstNode(2);
        ll.addFirstNode(3);
        ll.printList();

    }


}


//public class LinkedList {
//    Node head;
//
//    static class Node {
//        private int data;
//        private Node next;
//
//        Node(int d) {
//            this.data = d;
//            this.next = null;
//        }
//    }
//
//    //    void printList() {
////        if (this.head == null)
////            System.out.println("Empty LinkedList");
////        else {
////            while (true) {
////                System.out.print(this.head.data + " -> ");
////                if (this.head.next == null) {
////                    System.out.print("null");
////                    break;
////                } else {
////                    this.head = this.head.next;
////                }
////            }
////        }
////
//    void printList() {
//        Node current = this.head;
//        if (current == null)
//            System.out.println("Empty List");
//        else {
//            while (current != null) {
//                System.out.print(current.data + " -> ");
//                current = current.next;
//            }
//            System.out.print("null");
//        }
//    }
//
//
//    void insertFirstNode(int data) {
//        Node newNode = new Node(data);
//        newNode.next = this.head;
//        head = newNode;
//    }
//
//
//    void insertLastNode(int data) {
//
//    }
//
//
//    // Driver code
//    public static void main(String[] args) {
//        // create a node
//        Node one = new Node(1);
//        Node two = new Node(2);
//        Node three = new Node(3);
//
//        // create a LinkedList
//        LinkedList ll = new LinkedList();
////        ll.head = one;
////
////        one.next = two;
////        two.next = three;
////        ll.insertLastNode(1);
////        ll.insertLastNode(2);
////        ll.insertLastNode(3);
////        ll.insertLastNode(4);
//
//        ll.insertFirstNode(1);
//        ll.insertFirstNode(2);
////        ll.insertFirstNode(3);
////        ll.insertFirstNode(4);
////
//        ll.insertLastNode((5));
////        ll.insertLastNode(6);
////        ll.insertLastNode(7);
//
//
//        ll.printList();
//
//    }
//}
//
//////public class LinkedList {
//////    Node head = null;
//////
//////    static class Node {
//////        int data;
//////        Node next; //by default -> null
//////
//////        //constructor
//////        Node(int d) {
//////            this.data = d;
//////            Node next = null;
//////        }
//////    }
//////
////////    public void printList() {
////////        Node tmp = head;
////////        while (tmp != null) {
////////            System.out.print(tmp.data + " -> ");
////////            tmp = tmp.next;
////////        }
////////        System.out.print("null");
////////    }
//////
//////    public void printList() {
//////        Node tmp = head;
//////        while (tmp != null) {
//////            System.out.print(tmp.data + " -> ");
//////            tmp = tmp.next;
//////        }
//////        System.out.print("null");
//////    }
//////
//////    public void insertLastNode(int data) {
//////        Node newNode = new Node(data);
//////        Node tmp = head;
//////        while (tmp.next != null) {
//////            tmp = tmp.next;
//////        }
//////        tmp.next = newNode;
//////    }
//////
//////    public void insertFirstNode(int data) {
//////        Node newNode = new Node(data);
//////        Node tmp = head;
//////        head = newNode;
//////        newNode.next = tmp;
//////    }
//////
//////    public void insertAt(int data, int index) {
//////        Node newNode = new Node(data);
//////        Node tmp = head;
//////        Node tmp2;
//////
//////        while (tmp.next != null && tmp.data != index) {
//////            tmp = tmp.next;
//////        }
//////        tmp2 =tmp;
//////        tmp.next = newNode;
//////        newNode.next = tmp2;
////////        tmp.next = newNode;
//////    }
//////
//////
//////    public static void main(String[] args) {
//////        Node first = new Node(1);
//////        Node second = new Node(2);
//////        Node third = new Node(3);
//////
//////        LinkedList ll = new LinkedList();
//////        ll.head = first;
//////        ll.head.next = second;
//////        second.next = third;
//////
////////        ll.head = null;
//////
////////        ll.insertLastNode(4);
//////        ll.insertLastNode(5);
//////        ll.insertFirstNode(0);
//////        ll.insertLastNode(6);
//////        ll.insertLastNode(7);
//////
////////        ll.insertFirstNode(0);
//////////        ll.insertFirstNode(-1);
//////////        ll.insertFirstNode(-2);
////////        ll.insertAt(4,5);
//////        ll.printList();
//////
//////
////////        System.out.println(ll.head.data + " " + ll.head.next.data + " " + ll.head.next.next);;
//////    }
//////
//////
//////}
////
////public class LinkedList {
////    Node head = null;
////
////    public static class Node {
////        private int data;
////        private Node next;
////
////        public Node(int data) {
////            this.data = data;
////            this.next = null;
////        }
////
////    }
////
////    public void printList() {
////        while (this.head != null) {
//////            System.out.print((this.head != null) ? this.head.data + " -> " : "null");
////            System.out.print(this.head.data + " -> ");
////            this.head = this.head.next;
////        }
////        if (this.head == null)
////            System.out.println("null");
////    }
////
////    public void insertHeadNode(int data) {
////        Node newNode = new Node(data);
////
////        if (this.head == null)
////            this.head = newNode;
////        else {
////            Node tmp = this.head;
////            this.head = newNode;
////            this.head.next = tmp;   // similar to newNode.next = tmp;
////        }
////    }
////
////
////    public static void main(String[] args) {
////        LinkedList ll = new LinkedList();
////
//////        Node n1 = new Node(1);
//////        Node n2 = new Node(2);
//////        Node n3 = new Node(3);
//////
//////        ll.head = n1;
//////        ll.head.next = n2;
//////        n2.next = n3;
////
////        ll.printList();
////
////        ll.insertHeadNode(5);
////        ll.insertHeadNode(4);
////        ll.insertHeadNode(3);
////
//////        System.out.println(ll.head.data);
////
////        ll.printList();
////
////
//////        System.out.println(ll.head.next.data);
//////        System.out.println(n1);
//////        System.out.println();
////
////
////    }
////}
////
////
////// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> null -> null
////// 1 -> null
////// null
////
//
