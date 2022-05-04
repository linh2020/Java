public class myLinkedList {
    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    void printList() {
        if (this.head == null)
            System.out.println("Empty LinkedList");
        else {
//            while (this.head.next != null) {
//                System.out.print(this.head.data);
//                this.head.data = this.head.next.data;
//            }
            while (this.head != null) {
                System.out.print(this.head.data + " -> ");
                if (this.head.next == null) {
                    System.out.print("null");
                    break;
                } else
                    this.head = this.head.next;
            }
        }
    }

    void insertLastNode(int data) {

    }

    //Driver node
    public static void main(String[] args) {

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        System.out.println(one.data);
        System.out.println(one.next);


        System.out.println();

        myLinkedList ll = new myLinkedList();

        ll.head = one;
//        ll.head.next = two;
//        two.next = three;
//        one.next = two;
//        two.next = three;

//        System.out.println(ll.head.data);
//        System.out.println(ll.head.next);
//        System.out.println(ll.head.next.data);
//        System.out.println(two.next.data);

        //testin

        ll.printList();
    }
}
