package leetcode.editor.en;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class P239_SlidingWindowMaximunTest {

    private Solution239 solution;

    @BeforeAll
    public void setSolution() {
        solution = new Solution239();
    }

    @Test
    public void testCase1(){

        int[] answer = solution.maxSlidingWindow(new int[]{1,-1} , 1);

        int[] expect = new int[]{1,-1};

        Assertions.assertArrayEquals(answer, expect);
    }

    @Test
    public void testCase2(){
        /*
        nums = [7,2,4]
        k = 2
        * */

        int[] answer = solution.maxSlidingWindow(new int[]{7, 2, 4} , 2);

        int[] expect = new int[]{7,4};

        Assertions.assertArrayEquals(answer, expect);

    }
}
