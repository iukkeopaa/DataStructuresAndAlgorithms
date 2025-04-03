package Delete.Double;

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

public class DoublyLinkedListDeleteHead {
    public static DoublyListNode deleteAtHead(DoublyListNode head) {
        if (head == null) {
            return null;
        }
        DoublyListNode newHead = head.next;
        if (newHead != null) {
            newHead.prev = null;
        }
        return newHead;
    }

    public static void printList(DoublyListNode head) {
        DoublyListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyListNode head = new DoublyListNode(1);
        head.next = new DoublyListNode(2);
        head.next.prev = head;
        head.next.next = new DoublyListNode(3);
        head.next.next.prev = head.next;

        System.out.println("原链表:");
        printList(head);

        head = deleteAtHead(head);
        System.out.println("删除头部节点后的链表:");
        printList(head);
    }
}