import java.util.*;

public class BFS {
    // 图的邻接表表示
    private static Map<Integer, List<Integer>> graph = new HashMap<>();
    // 用于标记节点是否被访问过
    private static boolean[] visited;

    public static void bfs(int start) {
        int n = graph.size();
        visited = new boolean[n];
        // 创建一个队列用于 BFS
        Queue<Integer> queue = new LinkedList<>();
        // 将起始节点加入队列
        queue.add(start);
        // 标记起始节点为已访问
        visited[start] = true;

        while (!queue.isEmpty()) {
            // 从队列中取出一个节点
            int current = queue.poll();
            System.out.print(current + " ");

            // 遍历当前节点的所有邻居节点
            if (graph.containsKey(current)) {
                for (int neighbor : graph.get(current)) {
                    if (!visited[neighbor]) {
                        // 将未访问的邻居节点加入队列
                        queue.add(neighbor);
                        // 标记邻居节点为已访问
                        visited[neighbor] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // 添加图的边
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(2, 0);
        addEdge(2, 3);
        addEdge(3, 3);

        // 从节点 2 开始进行 BFS 遍历
        System.out.println("BFS starting from vertex 2:");
        bfs(2);
    }

    private static void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }
}    