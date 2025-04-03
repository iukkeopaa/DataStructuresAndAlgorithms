class DoublyListNode {
    int val;
    DoublyListNode prev;
    DoublyListNode next;

    // 构造函数，用于初始化节点的值
    DoublyListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}