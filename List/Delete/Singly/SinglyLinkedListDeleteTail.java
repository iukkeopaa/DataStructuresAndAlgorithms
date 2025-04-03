package Delete.Singly;



public class SinglyLinkedListDeleteTail {
    public static ListNode deleteAtTail(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
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

        head = deleteAtTail(head);
        System.out.println("删除尾部节点后的链表:");
        printList(head);
    }
}