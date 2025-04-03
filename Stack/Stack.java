import java.util.EmptyStackException;

class Stack {
    private int[] array;
    private int top;
    private int capacity;

    // 构造函数，初始化栈
    public Stack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    // 入栈操作
    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        array[++top] = element;
    }

    // 出栈操作
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top--];
    }

    // 查看栈顶元素
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top];
    }

    // 判断栈是否为空
    public boolean isEmpty() {
        return top == -1;
    }

    // 判断栈是否已满
    public boolean isFull() {
        return top == capacity - 1;
    }

    // 获取栈的大小
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());
    }
}    