import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int idx = 1;
        int firstIdx = -1;
        int secondIdx = -1;
        ListNode a = head;
        ListNode b = head.next;
        ListNode c = head.next.next;

        if (c == null) return new int[]{-1, -1};

        while (c != null) {
            if ((b.val > a.val && b.val > c.val) || (b.val < a.val && b.val < c.val)) {
                if (firstIdx == -1) {
                    firstIdx = idx;
                } else {
                    secondIdx = idx;
                }
            }
            a = a.next;
            b = b.next;
            c = c.next;
            idx++;
        }

        if (secondIdx == -1) return new int[]{-1, -1};

        int maxDist = secondIdx - firstIdx;
        int minDist = Integer.MAX_VALUE;
        firstIdx = -1;
        secondIdx = -1;
        idx = 1;
        a = head;
        b = head.next;
        c = head.next.next;

        while (c != null) {
            if ((b.val > a.val && b.val > c.val) || (b.val < a.val && b.val < c.val)) {
                if (firstIdx != -1) {
                    int dist = idx - firstIdx;
                    if (dist < minDist) {
                        minDist = dist;
                    }
                }
                firstIdx = idx;
            }
            a = a.next;
            b = b.next;
            c = c.next;
            idx++;
        }

        if (minDist == Integer.MAX_VALUE) {
            minDist = -1;
        }

        return new int[]{minDist, maxDist};
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 3 -> 2 -> 4 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(1);

        Solution solution = new Solution();
        int[] result = solution.nodesBetweenCriticalPoints(head);
        
        System.out.println("Minimum Distance: " + result[0]);
        System.out.println("Maximum Distance: " + result[1]);
    }
}
