package leetcode.editor.en;

//P735_Asteroid Collision

import java.util.ArrayDeque;
import java.util.Deque;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution735 {
    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> stack = new ArrayDeque<>();
        // 1. scan the asteroids array and create a stack to store the elements which are >= 0 , asteroids[i] != 0
        for (int i = 0; i < asteroids.length; i++) {
            // 2. push if asteroids[i] > 0 , else if  asteroids[i] , compare with the stack.peek()
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                // asteroids[i] < 0

                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])) {
                    stack.pop();
//                    if(stack.peek()+asteroids[i] == 0){
//                        stack.pop();
//                        break; // break here but can not deal with the asteroids[i] should be skipped , so remove the code to the out side of while loop
//                    }else if(stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])){
//                        stack.pop();
//                    }
                }

                // if you want to operate a Collection object must to check if it is empty or not
                // should swap the order
//                if(stack.peek()+asteroids[i] == 0){
//                    stack.pop();
//                }else if(stack.isEmpty() || stack.peek() < 0){
//                    stack.push(asteroids[i]);
//                }

                // correct
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroids[i]);
                } else if (stack.peek() + asteroids[i] == 0) {
                    stack.pop();
                }

            }
        }

        int[] ans = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
