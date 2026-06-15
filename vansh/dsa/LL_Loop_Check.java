package vansh.dsa;

import java.util.HashSet;

public class LL_Loop_Check {

    ListNode head;

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void add(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printListSafely() {
        ListNode curr = head;
        HashSet<ListNode> visitedNodes = new HashSet<>();

        while (curr != null) {
            if (visitedNodes.contains(curr)) {
                System.out.println("... (Loops back to node with value: " + curr.val + ")");
                return;
            }

            System.out.print(curr.val + " -> ");
            visitedNodes.add(curr);
            curr = curr.next;
        }
        System.out.println("null");
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LL_Loop_Check list = new LL_Loop_Check();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.print("Linear List: ");
        list.printListSafely();
        System.out.println("Has Cycle? " + list.hasCycle(list.head));


        ListNode temp = list.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = list.head.next;

        System.out.print("Cyclic List: ");
        list.printListSafely();
        System.out.println("Has Cycle? " + list.hasCycle(list.head));
    }
}