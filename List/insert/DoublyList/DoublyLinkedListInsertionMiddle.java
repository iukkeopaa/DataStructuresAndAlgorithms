package insert.DoublyList;



public class DoublyLinkedListInsertionMiddle {
    public static DoublyListNode insertAtPosition(DoublyListNode head, int newVal, int position) {
        if (position == 0) {
            return insertAtHead(head, newVal);
        }
        DoublyListNode newNode = new DoublyListNode(newVal);
        DoublyListNode current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            newNode.prev = current;
            current.next = newNode;
        }
        return head;
    }

    public static DoublyListNode insertAtHead(DoublyListNode head, int newVal) {
        DoublyListNode newNode = new DoublyListNode(newVal);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        return newNode;
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

        head = insertAtPosition(head, (int) 2.5, 1);
        System.out.println("在指定位置插入节点后的链表:");
        printList(head);
    }
}