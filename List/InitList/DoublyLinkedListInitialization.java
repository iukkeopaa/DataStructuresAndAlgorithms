package InitList;

// 定义双向链表节点类
class DoublyListNode {
    int val;
    DoublyListNode prev;
    DoublyListNode next;

    DoublyListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedListInitialization {
    public static void main(String[] args) {
        // 初始化链表节点
        DoublyListNode node1 = new DoublyListNode(1);
        DoublyListNode node2 = new DoublyListNode(2);
        DoublyListNode node3 = new DoublyListNode(3);

        // 连接节点形成双向链表
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;

        // 正向打印链表元素
        DoublyListNode current = node1;
        System.out.print("正向遍历: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

        // 反向打印链表元素
        current = node3;
        System.out.print("反向遍历: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.prev;
        }
    }
}