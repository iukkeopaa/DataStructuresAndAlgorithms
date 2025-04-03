package Delete.Singly;



public class SinglyLinkedListDeleteMiddle {
    public static ListNode deleteAtPosition(ListNode head, int position) {
        if (head == null) {
            return null;
        }
        if (position == 0) {
            return head.next;
        }
        ListNode current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            current.next = current.next.next;
        }
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

        head = deleteAtPosition(head, 1);
        System.out.println("删除指定位置节点后的链表:");
        printList(head);
    }
}