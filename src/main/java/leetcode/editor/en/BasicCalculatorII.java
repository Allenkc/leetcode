package leetcode.editor.en;

//P227_Basic Calculator II

import java.util.ArrayDeque;
import java.util.Deque;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution227 {
    public int calculate(String s) {

        Deque<Integer> stack = new ArrayDeque<>();
        // wip of the calculation
        int currentNum = 0;
        // default operation should be '+'
        char operation = '+';
        int len = s.length();

        // we need to detect the last iteration , so it's not good to use for each here (need extra work to check last iteration)
//        for(char c : s.toCharArray()){
//
//        }
        for(int i = 0 ; i < len ; i ++){
            char currentChar = s.charAt(i);
            if(Character.isDigit(currentChar)){
                currentNum = currentNum*10 + (currentChar - '0');
            }

            // 這裡用else if 會錯? Why
            // 因為最後一次掃到字元的時候上面的if 會進，然後這裡也要進， 用else if在最後一輪(i == len - 1)會直接跳掉少做一次運算!
            if(!Character.isDigit(currentChar) && currentChar!=' ' || i == len -1 ){
                switch (operation){
                    case '+':
                        stack.push(currentNum);
                        break;
                    case '-':
                        stack.push(-currentNum);
                        break;
                    case '*':
                        stack.push(stack.pop() * currentNum);
                        break;
                    case '/':
                        stack.push(stack.pop() / currentNum);
                        break;
                    default:
                        break;

                }
                // store the operation for next round usage
                operation = currentChar ;
                currentNum = 0;
            }
        }

        int ans = 0;
        while (!stack.isEmpty()){
            ans += stack.pop();
        }

        return ans;


        
    }
}
//leetcode submit region end(Prohibit modification and deletion)
