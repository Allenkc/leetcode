package leetcode.editor.en;

// P1059_All Paths from Source Lead to Destination

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// leetcode submit region begin(Prohibit modification and deletion)
class Solution1059 {

    private Map<Integer, List<Integer>> graph = new HashMap<>();
    private int dest;

    enum Color {
        GRAY, // means the node in current stack is processing
        BLACK // means the node in current stack is processed
    };

    public boolean leadsToDestination(int n, int[][] edges, int source, int destination) {

        this.dest = destination;

        for (int[] edge : edges) {
            int ori = edge[0];
            int des = edge[1];
            graph.computeIfAbsent(ori, value -> new ArrayList<>()).add(des);
        }

        return dfs(source , new HashMap<Integer , Color>());
    }

    private boolean dfs(int current , Map<Integer , Color> states){
        if(states.get(current) != null){
            // if current is gray , means it forms a cycle , if it;s BLACK then is a path that has been processed
            return states.get(current) == Color.BLACK;
        }

        if(graph.get(current) == null || graph.get(current).isEmpty()){
            states.computeIfAbsent(current , val -> Color.BLACK);
            return current == this.dest;
        }

        List<Integer> adjacentList = this.graph.get(current);
        states.computeIfAbsent(current , val -> Color.GRAY);

        for(int node : adjacentList){
            if(!dfs(node , states)){
                return false;
            }
        }

        states.put(current , Color.BLACK);
        return true;

    }
}
// leetcode submit region end(Prohibit modification and deletion)
