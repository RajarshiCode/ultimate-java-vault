package LearnCollectionFramework.res1;
import java.util.*;
public class AdjacencyListForGraphQues {

    public static void main(String[] args) {
        Map<Integer, List<Integer>> adj = new HashMap<>();

        adj.computeIfAbsent(1,f -> new ArrayList<>()).add(10);
        adj.computeIfAbsent(1,f -> new ArrayList<>()).add(20);
        adj.computeIfAbsent(1,f -> new ArrayList<>()).add(30);
        adj.computeIfAbsent(1,f -> new ArrayList<>()).add(10);


        System.out.println(adj);
    }
}
