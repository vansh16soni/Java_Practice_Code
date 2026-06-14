package vansh.dsa;



public class Link_List_Basic {
    Node head;
    private int size;

    Link_List_Basic(){
        size=0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next=newNode;
    }

    public void printList(){
        Node currNode = head;

        while(currNode!=null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("List is Already Empty");
            return;
        }

        head = this.head.next;
        size--;
    }

    public void removeLast(){
        if(head==null){
            System.out.print("List is Already Empty");
            return;
        }

        size--;
        if(head.next==null){
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;

        while(lastNode.next!=null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next=null;
    }

    public int getsize(){
        return size;
    }

    public void addInMiddle(int index, String data) {
        if(index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
        size++;


        Node newNode = new Node(data);
        if(head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for(int i=1; i<size; i++) {
            if(i == index) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }


    public static void main(String[] args) {
        Link_List_Basic list = new Link_List_Basic();

        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();


        list.addFirst("this");
        list.addInMiddle(2,"hi");
        list.printList();
        System.out.println(list.getsize());


        list.removeFirst();
        list.printList();


        list.removeLast();
        list.printList();

    }
}
