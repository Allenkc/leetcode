package leetcode.editor.en;

//P239_Sliding Window Maximum

import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution239 {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int len = nums.length;
        int[] result = new int[len - k + 1];
        // store the indice instead of the value
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0 ; i < len ; i ++){
            if(!dq.isEmpty() && dq.peek() < i-k+1){
                dq.poll();
            }

            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()] ){
                dq.pollLast();
            }

            dq.addLast(i);
            if(i-k+1>=0){
                result[i-k+1] = nums[dq.peekFirst()];
            }
        }

        return result;

    }

    /**
     * brute force TLE
    public int[] maxSlidingWindow(int[] nums, int k) {

        int len = nums.length;

        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            q.add(nums[i]);
        }

        result.add(getMaxFromQ(q));

        for (int current = k; current < len; current++) {

            q.add(nums[current]);
            q.remove();
            System.out.println(getMaxFromQ(q));
            result.add(getMaxFromQ(q));

        }

        int[] resultArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {

            resultArr[i] = result.get(i);
        }

        return resultArr;

    }

    private int getMaxFromQ(Queue<Integer> q) {

        int max = Integer.MIN_VALUE;
        for (int c : q) {
            if (c > max) {
                max = c;
            }
        }

        return max;

    }
     */
}
//leetcode submit region end(Prohibit modification and deletion)
