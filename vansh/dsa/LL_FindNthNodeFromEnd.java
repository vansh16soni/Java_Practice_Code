package vansh.dsa;


 class FindNthNodeFromEnd {

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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        int ptf = size - n;
        ListNode prev = head;
        int cp = 1;

        while (cp != ptf) {
            prev = prev.next;
            cp++;
        }

        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        FindNthNodeFromEnd list = new FindNthNodeFromEnd();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print("Original List: ");
        list.printList();

        int n = 2;
        System.out.println("Removing the " + n + "nd node from the end...");

        list.head = list.removeNthFromEnd(list.head, n);

        System.out.print("Resulting List: ");
        list.printList();
    }
}
