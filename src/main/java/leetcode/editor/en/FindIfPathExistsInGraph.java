package leetcode.editor.en;

//P1971_Find if Path Exists in Graph

import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1971 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer , List<Integer>> graph = new HashMap<>();

        for(int[] edge : edges){
            int src = edge[0];
            int dest = edge[1];

            graph.computeIfAbsent(src , val-> new ArrayList<>()).add(dest);
            graph.computeIfAbsent(dest , val-> new ArrayList<>()).add(src);
        }

        boolean[] seen = new boolean[n];
        seen[source] = true;

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(source);

        while(!queue.isEmpty()){
            int current = queue.remove();

            if(current == destination){
                return true;
            }

            List<Integer> nextRoundAdjList = graph.get(current);

            for(int next : nextRoundAdjList){
                if(!seen[next]){
                    seen[next] = true;
                    queue.add(next);
                }

            }
        }

        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
