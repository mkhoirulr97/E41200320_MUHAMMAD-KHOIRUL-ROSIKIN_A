package latihan_dfs;

import java.util.*;

/**
 *
 * @author khoirul
 */
public class dfs {

    //no simpul
    int V;

    //membuat grafik
    LinkedList<Integer> adjList[];

    // constructor
    dfs(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adjList[i] = new LinkedList();  //daftar kosong
        }
    }

    //membuat edge graph
    void addEdgesToGraph(int v, int u) {
        adjList[v].add(u);
    }

    //DFS Traverse
    void DFTraversal(int v, int visited[]) {
        visited[v] = 1;
        System.out.print(v + " ");
        Iterator<Integer> i = adjList[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (visited[n] == 0) {
                DFTraversal(n, visited);
            }
        }
    }

    //DFS Search
    void DFSearch(int v) {

        int visited[] = new int[V];

        DFTraversal(v, visited);
        for (int i = 1; i < V; i++) {
            if (visited[i] == 0) {
                DFTraversal(i, visited);
            }
        }
    }

    public static void main(String args[]) {
        dfs obj = new dfs(10);

        obj.addEdgesToGraph(1, 3);
        obj.addEdgesToGraph(1, 4);
        obj.addEdgesToGraph(3, 5);
        obj.addEdgesToGraph(3, 6);
        obj.addEdgesToGraph(4, 7);
        obj.addEdgesToGraph(4, 8);
        obj.addEdgesToGraph(2, 9);
        obj.addEdgesToGraph(2, 1);
        obj.addEdgesToGraph(1, 2);

        obj.DFSearch(1);
    }
}
