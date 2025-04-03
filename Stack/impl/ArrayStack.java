package impl;

class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    // 构造函数，初始化栈
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    // 入栈操作
    public void push(int item) {
        if (isFull()) {
            System.out.println("栈已满，无法入栈");
            return;
        }
        stack[++top] = item;
    }

    // 出栈操作
    public int pop() {
        if (isEmpty()) {
            System.out.println("栈为空，无法出栈");
            return -1;
        }
        return stack[top--];
    }

    // 获取栈顶元素
    public int peek() {
        if (isEmpty()) {
            System.out.println("栈为空，没有栈顶元素");
            return -1;
        }
        return stack[top];
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
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("栈顶元素: " + stack.peek());
        System.out.println("出栈元素: " + stack.pop());
        System.out.println("栈的大小: " + stack.size());
    }
}    