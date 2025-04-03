package insert.SInglyList;



public class SinglyLinkedListInsertion {
    public static ListNode insertAtHead(ListNode head, int newVal) {
        ListNode newNode = new ListNode(newVal);
        newNode.next = head;
        return newNode;
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

        head = insertAtHead(head, 0);
        System.out.println("在头部插入节点后的链表:");
        printList(head);
    }
}