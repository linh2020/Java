import java.util.Arrays;
import java.util.List;

/***
 * Definition for singly-linked list.
 */

class ListNode {
    ListNode head;
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    //owner
    void addLastNode(int val) {
        ListNode newNode = new ListNode(val);
        ListNode tmp = head;
        if (this.head == null) {
            this.head = newNode;
        }
        while (tmp != null) {
            if (tmp.next != null)
                tmp = tmp.next;
            else {
                tmp.next = newNode;
                tmp = tmp.next;
                break;
            }
        }
    }

    void printList() {
        if (this.head == null)
            System.out.println("Empty List");
        else {
            ListNode tmp = head;
            while (tmp != null) {
                System.out.print(tmp.val + " -> ");
                tmp = tmp.next;
            }
            System.out.print("nul\n");
        }
    }
}

public class AddTwoNumbers_2 {
    public int addTwoNumbers(ListNode l1, ListNode l2) {
        int n1;
        int n2;
        int sum = 0;


        return sum;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
//        System.out.println(l1.val);
        l1.addLastNode(2);
        l1.addLastNode(3);
        l1.addLastNode(4);
        l1.printList();

        ListNode l2 = new ListNode();
        l2.addLastNode(5);
        l2.addLastNode(6);
        l2.addLastNode(4);
        l2.printList();

    }
}

// org
//public class AddTwoNumbers_2 {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int n1;
//        int n2;
//        ListNode sum = new ListNode();
//
//
//        return  sum;
//    }
//}
