class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveNode2 {
    public static ListNode removeNodes(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode i = head;
        ListNode prev = dummy;

        while (i != null) {
            ListNode j = i.next;

            while (j != null) {
                if (j.val > i.val) {
                    prev.next = i.next;
                    break;
                }
                j = j.next;
            }

            if (j == null) {
                prev = i;
            }
            i = i.next;
        }

        return dummy.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(5);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(5);
        
        System.out.println("Original list:");
        printLinkedList(head);

        head = removeNodes(head);
        System.out.println("Modified list:");
        printLinkedList(head);
    }
}
