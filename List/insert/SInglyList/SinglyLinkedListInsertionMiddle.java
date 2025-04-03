package insert.SInglyList;


import static insert.SInglyList.SinglyLinkedListInsertion.insertAtHead;



public class SinglyLinkedListInsertionMiddle {
    public static ListNode insertAtPosition(ListNode head, int newVal, int position) {
        if (position == 0) {
            return insertAtHead(head, newVal);
        }
        ListNode newNode = new ListNode(newVal);
        ListNode current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
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

        head = insertAtPosition(head, (int) 2.5, 1);
        System.out.println("在指定位置插入节点后的链表:");
        printList(head);
    }
}