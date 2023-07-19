import java.util.ArrayList;
import java.util.List;

// Graph implementation using adjacency list
class Graph {
    int vertices;
    List<List<Integer>> adjList;

    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Adding an edge between two vertices
    void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }
}

// Usage
Graph graph = new Graph(5);
graph.addEdge(0, 1);
graph.addEdge(0, 4);
graph.addEdge(1, 2);
graph.addEdge(1, 3);
graph.addEdge(1, 4);

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Graph {
    private int vertices;
    private List<List<Integer>> adjList;

    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public void breadthFirstSearch(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.offer(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            List<Integer> neighbors = adjList.get(currentVertex);
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}
