package leetcode.editor.en;

// P797_All Paths From Source to Target

import java.util.*;

// leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        int dest = n - 1;

        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> queue = new ArrayDeque<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        queue.add(path);

        while (!queue.isEmpty()) {
            List<Integer> currentPath = queue.remove();
            int node = currentPath.get(currentPath.size() - 1);

            if (node == dest) {
                result.add(new ArrayList<>(currentPath));
            }

            for(int next : graph[node]){
                List<Integer> nextPath = new ArrayList<>(currentPath);
                nextPath.add(next);
                queue.add(nextPath);
            }
        }

        return result;
    }
}
// leetcode submit region end(Prohibit modification and deletion)
