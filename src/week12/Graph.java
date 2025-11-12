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
    public boolean areConnected(N from,N to){
        return this.adjacencyList.containsKey(from) &&
                this.adjacencyList.get(from).contains(to);
    }
    public boolean validPath(ArrayList<N> path){
        for (int x=0;x<path.size()-1;x++){
            if (!areConnected(path.get(x),path.get(x+1))){
                return false;
            }
        }
        return true;
    }
    public ArrayList<N> mostIncomingFlights(){
        HashMap<N,Integer> incoming=new HashMap<>();
        for (ArrayList<N> destination :
                this.adjacencyList.values()){
            for (N to : destination){
                if (!incoming.containsKey(to)){
                    incoming.put(to,1);
                } else {
                    incoming.put(to,incoming.get(to)+1);
                }
            }
        }
        int max=0;
        for (int n : incoming.values()){
            if (n>max){
                max=n;
            }
        }
        ArrayList<N> out=new ArrayList<>();
        for (N node : incoming.keySet()){
            if (incoming.get(node)==max){
                out.add(node);
            }
        }
        return out;
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

        ArrayList<String> path2=new ArrayList<>(
                Arrays.asList("BUF","JFK","YYZ","NWK")
        );
        System.out.println(graph.validPath(path2));

        ArrayList<String> path3=new ArrayList<>(
                Arrays.asList("CDG","BUF","JFK","YYZ","CDG","NWK")
        );
        System.out.println(graph.validPath(path3));
        System.out.println(graph.mostIncomingFlights());
    }
}
