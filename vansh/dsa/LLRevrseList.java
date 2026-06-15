package vansh.dsa;

public class LLRevrseList {

    Node head;
    private int size;

    LLRevrseList(){
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = this.new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = this.new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList(){
        Node currNode = head;

        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("List is Already Empty");
            return;
        }

        head = head.next;
        size--;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("List is Already Empty");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    public int getsize(){
        return size;
    }

    public void addInMiddle(int index, String data) {
        if(index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }

        Node newNode = this.new Node(data);
        if(head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currNode = head;
        for(int i = 0; i < index - 1; i++) {
            currNode = currNode.next;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseListrecursive(Node head){
        if(head == null || head.next == null ){
            return head;
        }
        Node newHead = reverseListrecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        LLRevrseList list = new LLRevrseList();

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");

        System.out.println("Original List:");
        list.printList();

        System.out.println("\nReversing iteratively...");
        list.reverseList();
        list.printList();

        System.out.println("\nReversing back recursively...");
        list.head = list.reverseListrecursive(list.head);
        list.printList();
    }
}