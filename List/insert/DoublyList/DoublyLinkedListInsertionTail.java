package insert.DoublyList;



public class DoublyLinkedListInsertionTail {
    public static DoublyListNode insertAtTail(DoublyListNode head, int newVal) {
        DoublyListNode newNode = new DoublyListNode(newVal);
        if (head == null) {
            return newNode;
        }
        DoublyListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        return head;
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

        head = insertAtTail(head, 4);
        System.out.println("在尾部插入节点后的链表:");
        printList(head);
    }
}