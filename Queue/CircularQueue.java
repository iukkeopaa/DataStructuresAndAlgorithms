class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("队列已满，无法入队。");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("队列为空，无法出队。");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("队列为空，无元素可查看。");
            return -1;
        }
        return queue[front];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("出队元素: " + queue.dequeue());
        System.out.println("队首元素: " + queue.peek());
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println("队列大小: " + queue.size());
    }
}    