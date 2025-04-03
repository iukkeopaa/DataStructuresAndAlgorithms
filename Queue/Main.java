class NodeQueue<T> {
    T data;
    NodeQueue<T> next;

    public NodeQueue(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListQueue<T> {
    private NodeQueue<T> front;
    private NodeQueue<T> rear;
    private int size;

    public LinkedListQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(T item) {
        NodeQueue<T> newNode = new NodeQueue<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("队列是空的");
        }
        T item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("队列是空的");
        }
        return front.data;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("队列大小: " + queue.size());
        System.out.println("队首元素: " + queue.peek());

        System.out.println("出队元素: " + queue.dequeue());
        System.out.println("出队后队列大小: " + queue.size());
    }
}    