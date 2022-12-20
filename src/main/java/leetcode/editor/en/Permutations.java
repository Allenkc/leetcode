package leetcode.editor.en;

//P46_Permutations

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[length];
        backrack(result , new ArrayDeque<Integer>() , nums , used);
        return result;
    }

    private void backrack(List<List<Integer>> list , Deque<Integer> path , int[] nums ,boolean[] used ){
        if(path.size() == nums.length){
            list.add(new ArrayList<>(path));
            return;
        }else{
            for(int i = 0 ; i <nums.length; i ++ ){
                if(used[i]){
                    continue;
                }
                path.add(nums[i]);
                used[i] = true;
                backrack(list ,path , nums , used );
                path.removeLast();
                used[i] = false;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
