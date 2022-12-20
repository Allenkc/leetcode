package leetcode.editor.en;

import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
public class CombinationSum {
//    class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        //Use a stack to maintain the wip list
        Deque<Integer> currentPath = new ArrayDeque<Integer>();

        // sort the candidates to ensure the array is sorted in asec order (for later pruning the problem while doing dfs)
        Arrays.sort(candidates);
        backtrack(result , currentPath ,candidates , target , 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result ,Deque<Integer> path , int[] candidates, int remain , int start ){

        if(remain==0){
            result.add(new ArrayList<>(path));
        }else{
            for(int i = start ; i < candidates.length ; i++){
                if(candidates[i] > remain){
                    break;
                }

                path.add(candidates[i]);
                backtrack(result , path ,candidates , remain -  candidates[i] , i);
                path.removeLast();
            }
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
