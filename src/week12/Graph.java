package week12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph<N> {
    private HashMap<N, ArrayList<N>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    public void addEdge(N from, N to){
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(to);
    }
    private void addNode(N a){
        if (!this.adjacencyList.containsKey(a)){
            this.adjacencyList.put(a,new ArrayList<>());
        }
    }
    public String toString(){
        return this.adjacencyList.toString();
    }
    public static void main(String[] args) {
        Graph<String> graph=new Graph<>();
        graph.addEdge("BUF","JFK");
        graph.addEdge("BUF","YYZ");
        graph.addEdge("YYZ","JFK");
        graph.addEdge("NWK","BUF");
        graph.addEdge("NWK","JFK");
        graph.addEdge("NWK","YYZ");
        graph.addEdge("JFK","BUF");
        graph.addEdge("JFK","NWK");
        graph.addEdge("JFK","YYZ");

        System.out.println(graph);

        ArrayList<String> path=new ArrayList<>(
                Arrays.asList("BUF","JFK","YYZ")
        );
        System.out.println(graph.validPath(path));
    }
}
