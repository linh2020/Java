import java.util.List;

class ListNode {
//    ListNode head;

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

    void printList() {
        if (this.next == null)
            System.out.println("Empty List");
//        while (this.next != null) {
//            System.out.print(this.val+ " -> ");
//            this = this.next;
//        }
    }
}

public class AddTwoNumbers_2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode emptyNode = new ListNode(0);
        ListNode root = new ListNode(0);
        ListNode tmp = root;
        int sum;
        int carry = 0;

        while (l1 != l1 || l1 != l2) {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;

            sum = v1 + v2 + carry;

            carry = sum / 10;
            tmp.next = new ListNode(sum % 10);
            // root = tmp.next;
            tmp = tmp.next;

            // System.out.print(tmp.val);
            // System.out.print(root.val);

            l1 = l1.next != null ? l1.next : emptyNode;
            l2 = l2.next != null ? l2.next : emptyNode;

            // if (sum>9)
            //     tmp.next = new ListNode(sum/10);
        }

        // System.out.print(root.next.val);

        return root.next;
    }

    public static void main(String[] args) {
        //[2,4,3]
        //[5,6,4]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        System.out.println("\nl1: ");
        System.out.print(l1.val);
        System.out.print(l1.next.val);
        System.out.print(l1.next.next.val);

        l1.printList();

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println("\n---");
        System.out.println("\nl2: ");
        System.out.print(l2.val);
        System.out.print(l2.next.val);
        System.out.print(l2.next.next.val);

        ListNode result = addTwoNumbers(l1, l2);
        System.out.println("\nResult: ");
        System.out.println(result.val);
        System.out.println(result.next.val);
        System.out.println(result.next.next.val);

    }
}
