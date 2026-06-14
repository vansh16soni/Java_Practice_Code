package vansh.dsa;

public class Queue_By_Array {
    int arr[];
    int size;
    int rear;

    Queue_By_Array(int size) {
        this.size = size;
        arr = new int[size];
        this.rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void add(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot add " + data);
            return;
        }
        rear++;
        arr[rear] = data;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int front = arr[0];

        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        return arr[0];
    }

    public static void main(String[] args) {
        Queue_By_Array q = new Queue_By_Array(5);

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Removed: " + q.remove());
        System.out.println("Peek: " + q.peek());
    }
}