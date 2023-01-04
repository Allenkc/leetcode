package leetcode.editor.en;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class P2_AddTwoNumbersTest {
    private Solution2 solution;

    @BeforeAll
    public void setSolution() {
        solution = new Solution2();
    }

    /**
     * l1 = [2,4,3]
     * l2 = [5,6,4]
     * output = [7,0,8]
     */
    @Test
    public void testCase1(){
        ListNode l1 = new ListNode(2 , new ListNode(4 , new ListNode(3)));
        ListNode l2 = new ListNode(5 , new ListNode(6 , new ListNode(4)));
        ListNode answer = solution.addTwoNumbers(l1 , l2);

        ListNode expect = new ListNode(7 , new ListNode(0 , new ListNode(8)));

        while(answer!=null && expect!=null){
            Assertions.assertEquals(answer.val , expect.val );
            answer=answer.next;
            expect=expect.next;
        }

    }

}
