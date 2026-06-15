package vansh.dsa;

public class LL_Palindrome_Check {

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

    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public ListNode getMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode firstHalfEnd = getMiddle(head);
        ListNode secondHalfStart = reverse(firstHalfEnd.next);
        ListNode firstHalfStart = head;

        while (secondHalfStart != null) {
            if (secondHalfStart.val != firstHalfStart.val) {
                return false;
            }
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }

        return true;
    }

    public static void main(String[] args) {
        LL_Palindrome_Check list1 = new LL_Palindrome_Check();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(1);

        System.out.print("List 1: ");
        list1.printList();
        System.out.println("Is Palindrome? " + list1.isPalindrome(list1.head));



        LL_Palindrome_Check list2 = new LL_Palindrome_Check();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.print("List 2: ");
        list2.printList();
        System.out.println("Is Palindrome? " + list2.isPalindrome(list2.head));
    }
}