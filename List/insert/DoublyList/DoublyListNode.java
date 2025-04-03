package insert.DoublyList;

/**
 * @Description:
 * @Author: wjh
 * @Date: 2025/4/3 上午10:53
 */
class DoublyListNode {
    int val;
    DoublyListNode prev;
    DoublyListNode next;

    DoublyListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
