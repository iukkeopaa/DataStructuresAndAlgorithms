import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        // 创建一个队列
        Queue<Integer> queue = new LinkedList<>();

        // 入队操作
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        // 输出队列元素
        System.out.println("当前队列元素: " + queue);

        // 查看队首元素
        Integer front = queue.peek();
        System.out.println("队首元素: " + front);

        // 出队操作
        Integer removed = queue.poll();
        System.out.println("出队元素: " + removed);

        // 输出出队后的队列元素
        System.out.println("出队后队列元素: " + queue);
    }
}    