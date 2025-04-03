package Delete.Double;



public class DoublyLinkedListDeleteTail {
    public static DoublyListNode deleteAtTail(DoublyListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        DoublyListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        DoublyListNode newTail = current.prev;
        newTail.next = null;
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

        head = deleteAtTail(head);
        System.out.println("删除尾部节点后的链表:");
        printList(head);
    }
}