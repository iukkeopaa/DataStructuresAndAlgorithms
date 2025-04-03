import java.util.ArrayList;
import java.util.List;

class Graph {
    private int numVertices;
    private boolean directed;
    private boolean weighted;
    private int[][] adjMatrix;
    private List<List<Edge>> adjList;

    static class Edge {
        int dest;
        int weight;

        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }

        @Override
        public String toString() {
            if (weight == 1) {
                return String.valueOf(dest);
            }
            return dest + "(" + weight + ")";
        }
    }

    public Graph(int numVertices, boolean directed, boolean weighted) {
        this.numVertices = numVertices;
        this.directed = directed;
        this.weighted = weighted;
        adjMatrix = new int[numVertices][numVertices];
        adjList = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest, int weight) {
        if (weighted) {
            adjMatrix[src][dest] = weight;
        } else {
            adjMatrix[src][dest] = 1;
        }
        adjList.get(src).add(new Edge(dest, weight));
        if (!directed) {
            if (weighted) {
                adjMatrix[dest][src] = weight;
            } else {
                adjMatrix[dest][src] = 1;
            }
            adjList.get(dest).add(new Edge(src, weight));
        }
    }

    public void printAdjMatrix() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printAdjList() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Edge edge : adjList.get(i)) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 有向无权图
        Graph directedUnweightedGraph = new Graph(4, true, false);
        directedUnweightedGraph.addEdge(0, 1, 1);
        directedUnweightedGraph.addEdge(1, 2, 1);
        directedUnweightedGraph.addEdge(2, 3, 1);
        System.out.println("有向无权图邻接矩阵:");
        directedUnweightedGraph.printAdjMatrix();
        System.out.println("有向无权图邻接表:");
        directedUnweightedGraph.printAdjList();

        // 无向无权图
        Graph undirectedUnweightedGraph = new Graph(4, false, false);
        undirectedUnweightedGraph.addEdge(0, 1, 1);
        undirectedUnweightedGraph.addEdge(1, 2, 1);
        undirectedUnweightedGraph.addEdge(2, 3, 1);
        System.out.println("无向无权图邻接矩阵:");
        undirectedUnweightedGraph.printAdjMatrix();
        System.out.println("无向无权图邻接表:");
        undirectedUnweightedGraph.printAdjList();

        // 有向有权图
        Graph directedWeightedGraph = new Graph(4, true, true);
        directedWeightedGraph.addEdge(0, 1, 2);
        directedWeightedGraph.addEdge(1, 2, 3);
        directedWeightedGraph.addEdge(2, 3, 4);
        System.out.println("有向有权图邻接矩阵:");
        directedWeightedGraph.printAdjMatrix();
        System.out.println("有向有权图邻接表:");
        directedWeightedGraph.printAdjList();

        // 无向有权图
        Graph undirectedWeightedGraph = new Graph(4, false, true);
        undirectedWeightedGraph.addEdge(0, 1, 2);
        undirectedWeightedGraph.addEdge(1, 2, 3);
        undirectedWeightedGraph.addEdge(2, 3, 4);
        System.out.println("无向有权图邻接矩阵:");
        undirectedWeightedGraph.printAdjMatrix();
        System.out.println("无向有权图邻接表:");
        undirectedWeightedGraph.printAdjList();
    }
}    