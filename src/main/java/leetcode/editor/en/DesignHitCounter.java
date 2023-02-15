package leetcode.editor.en;

//P362_Design Hit Counter

import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

//leetcode submit region begin(Prohibit modification and deletion)
class HitCounter {

    private int total = 0;
    private Deque<Pair<Integer,Integer>> hitsQueue = new ArrayDeque<>();

    public HitCounter() {

    }
    
    public void hit(int timestamp) {
        if(hitsQueue.isEmpty() || hitsQueue.getLast().getKey() != timestamp ){
            // add a new pair to the hits dequeue
            hitsQueue.add(new Pair<>(timestamp , 1));
        }else{
            // multiple hits at the same time
            // Update the count of latest timestamp by incrementing the count by 1
            int currentCount = hitsQueue.getLast().getValue();
            currentCount ++;

            hitsQueue.removeLast();
            hitsQueue.addLast(new Pair<>(timestamp ,currentCount ));
        }
        total++;
    }
    
    public int getHits(int timestamp) {
        while(!hitsQueue.isEmpty()){
            int diff = timestamp - hitsQueue.peek().getKey();
            if(diff >= 300){
                int counts = hitsQueue.remove().getValue();
                total -= counts;
            }else{
                break;
            }
        }
        return total;
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */
//leetcode submit region end(Prohibit modification and deletion)
