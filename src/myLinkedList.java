public class myLinkedList {
    Node head;


    class Node {
        private int data;
        private Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    } // End of class Node

    void addFirstNode(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    void insertLastNode(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            Node tmpNode = this.head;
            while (tmpNode != null) {
                if (tmpNode.next == null) {
                    tmpNode.next = newNode;
                    break;
                } else {
                    tmpNode = tmpNode.next;
                }
            }

            //similar way
//            while (tmpNode.next != null) {
//                tmpNode = tmpNode.next;
//            }
//            tmpNode.next = newNode;
            // end of new way
        }
    }

    void insertAfterNode(int prev_number, int new_number) {
        Node newNode = new Node(new_number);

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node tmpNode = this.head;
            while (tmpNode != null) {
                if (tmpNode.data == prev_number) {
                    newNode.next = tmpNode.next;
                    tmpNode.next = newNode;
                    break;
                } else {
                    if (tmpNode.next == null) {
                        System.out.println("No Prev Number Found");
                        break;
                    } else
                        tmpNode = tmpNode.next;
                }
            }

        }
    }


    void printList() {
        if (head == null) {
            System.out.println("Empty List");
        }
        Node tmpNode = this.head;
        while (tmpNode != null) {
            System.out.print(tmpNode.data + " -> ");
            tmpNode = tmpNode.next;
        }
        System.out.print("null\n");
// if using directly head instead of define new Node tmpNode,
// we will change content permanently
//        while (head != null) {
//            System.out.print(head.data + " -> ");
//            head = head.next;
//        }
//        System.out.print("null\n");
    }


    // Driver code
    public static void main(String[] args) {
        myLinkedList ll = new myLinkedList();

        ll.addFirstNode(1);
        ll.addFirstNode(2);
        ll.addFirstNode(3);
        ll.printList();

        System.out.println();
        ll.insertLastNode(5);
        ll.insertLastNode(6);
        ll.insertLastNode(7);
        ll.printList();

        ll.insertAfterNode(1, 999);
        ll.printList();

        System.out.println();
        ll.insertAfterNode(11, 333);
        ll.printList();

        System.out.println();
        System.out.println("The head: " + ll.head.data);
    }
}

//public class myLinkedList {
//    Node head;
//
//    public static class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            this.data = d;
//            this.next = null;
//        }
//    }
//
//    void printList() {
//        if (this.head == null)
//            System.out.println("Empty LinkedList");
//        else {
////            while (this.head.next != null) {
////                System.out.print(this.head.data);
////                this.head.data = this.head.next.data;
////            }
//            while (this.head != null) {
//                System.out.print(this.head.data + " -> ");
//                if (this.head.next == null) {
//                    System.out.print("null");
//                    break;
//                } else
//                    this.head = this.head.next;
//            }
//        }
//    }
//
//    void insertLastNode(int data) {
//
//    }
//
//    //Driver node
//    public static void main(String[] args) {
//
//        Node one = new Node(1);
//        Node two = new Node(2);
//        Node three = new Node(3);
//        System.out.println(one.data);
//        System.out.println(one.next);
//
//
//        System.out.println();
//
//        myLinkedList ll = new myLinkedList();
//
//        ll.head = one;
////        ll.head.next = two;
////        two.next = three;
////        one.next = two;
////        two.next = three;
//
////        System.out.println(ll.head.data);
////        System.out.println(ll.head.next);
////        System.out.println(ll.head.next.data);
////        System.out.println(two.next.data);
//
//
//        ll.printList();
//    }
//}


