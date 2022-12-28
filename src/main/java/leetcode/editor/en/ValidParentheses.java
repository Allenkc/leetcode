package leetcode.editor.en;

//P20_Valid Parentheses

import java.util.ArrayDeque;
import java.util.Deque;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {

        if(s.length()%2 != 0){
            return false;
        }

        Deque<Character> charStack = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            switch (c){
                case '(':
                case '[':
                case '{':
                    charStack.push(c);
                    break;
                case ')':
                    if(!charStack.isEmpty() && charStack.peek() == '('){
                        charStack.pop();
                    }else{
                        return false;
                    }
                    break;
                case ']':
                    if(!charStack.isEmpty() && charStack.peek() == '['){
                        charStack.pop();
                    }else{
                        return false;
                    }
                    break;
                case '}':
                    if(!charStack.isEmpty() && charStack.peek() == '{'){
                        charStack.pop();
                    }else{
                        return false;
                    }
                    break;

            }
        }

        return charStack.isEmpty();
    }
}
/*
* "()[]{}"
* */
//leetcode submit region end(Prohibit modification and deletion)
