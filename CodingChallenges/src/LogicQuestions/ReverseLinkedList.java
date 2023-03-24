package LogicQuestions;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        // create a linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        
        // print the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // reverse the linked list
        ListNode newHead = reverseLinkedList(head);

        // print the reversed linked list
        System.out.println("Reversed Linked List:");
        printLinkedList(newHead);
    }

    // function to reverse a linked list
    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // function to print a linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
