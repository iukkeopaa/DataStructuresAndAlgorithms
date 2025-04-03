import java.util.ArrayList;
import java.util.List;

// 图节点类
class Node {
    int val;
    List<Node> neighbors;

    public Node(int val) {
        this.val = val;
        this.neighbors = new ArrayList<>();
    }
}

public class DFS {
    // 用于标记节点是否已被访问
    private boolean[] visited;

    public void dfs(Node node) {
        // 节点数量
        int n = 100; // 假设最大节点数为 100，可根据实际情况调整
        visited = new boolean[n];
        dfsHelper(node);
    }

    private void dfsHelper(Node node) {
        if (node == null || visited[node.val]) {
            return;
        }
        // 标记当前节点为已访问
        visited[node.val] = true;
        // 处理当前节点，这里简单打印节点值
        System.out.print(node.val + " ");
        // 递归访问相邻节点
        for (Node neighbor : node.neighbors) {
            dfsHelper(neighbor);
        }
    }

    public static void main(String[] args) {
        // 创建图节点
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        // 添加相邻节点
        node1.neighbors.add(node2);
        node1.neighbors.add(node3);
        node2.neighbors.add(node4);

        DFS dfs = new DFS();
        dfs.dfs(node1);
    }
}    