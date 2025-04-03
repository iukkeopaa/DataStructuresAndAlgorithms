package Delete.Double;



public class DoublyLinkedListDeleteMiddle {
    public static DoublyListNode deleteAtPosition(DoublyListNode head, int position) {
        if (head == null) {
            return null;
        }
        if (position == 0) {
            return deleteAtHead(head);
        }
        DoublyListNode current = head;
        for (int i = 0; i < position && current != null; i++) {
            current = current.next;
        }
        if (current != null) {
            if (current.prev != null) {
                current.prev.next = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
        return head;
    }

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

        head = deleteAtPosition(head, 1);
        System.out.println("删除指定位置节点后的链表:");
        printList(head);
    }
}