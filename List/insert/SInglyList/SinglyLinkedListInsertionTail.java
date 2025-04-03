package insert.SInglyList;




public class SinglyLinkedListInsertionTail {
    public static ListNode insertAtTail(ListNode head, int newVal) {
        ListNode newNode = new ListNode(newVal);
        if (head == null) {
            return newNode;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        System.out.println("原链表:");
        printList(head);

        head = insertAtTail(head, 4);
        System.out.println("在尾部插入节点后的链表:");
        printList(head);
    }
}