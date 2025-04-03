package Delete.Singly;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SinglyLinkedListDeleteHead {
    public static ListNode deleteAtHead(ListNode head) {
        if (head == null) {
            return null;
        }
        return head.next;
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

        head = deleteAtHead(head);
        System.out.println("删除头部节点后的链表:");
        printList(head);
    }
}