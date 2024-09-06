class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycleDetector {

    // Method to detect if there's a cycle in the linked list
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow pointer by 1
            fast = fast.next.next;   // Move fast pointer by 2

            if (slow == fast) {       // Cycle detected
                return true;
            }
        }

        return false; // No cycle detected
    }

    public static void main(String[] args) {
        // Create a linked list with a cycle for testing
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2; // Creates a cycle

        LinkedListCycleDetector detector = new LinkedListCycleDetector();
        boolean hasCycle = detector.hasCycle(node1);

        System.out.println("Linked List has cycle: " + hasCycle);
    }
}
