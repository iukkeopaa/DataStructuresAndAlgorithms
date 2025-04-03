package InitList;

// 定义单向链表节点类
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SinglyLinkedListInitialization {
    public static void main(String[] args) {
        // 初始化链表节点
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        // 连接节点形成链表
        node1.next = node2;
        node2.next = node3;

        // 打印链表元素
        ListNode current = node1;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}