package impl;

class LinkedListStack {
    private NodeStack top;
    private int size;

    // 构造函数，初始化栈
    public LinkedListStack() {
        this.top = null;
        this.size = 0;
    }

    // 入栈操作
    public void push(int element) {
        NodeStack newNode = new NodeStack(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // 出栈操作
    public int pop() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        int popped = top.data;
        top = top.next;
        size--;
        return popped;
    }

    // 查看栈顶元素
    public int peek() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return top.data;
    }

    // 判断栈是否为空
    public boolean isEmpty() {
        return top == null;
    }

    // 获取栈的大小
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());
    }
}

