package leetcode.editor.en;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class P41_FirstMissingPositiveTest {
    private Solution41 solution;

    @BeforeAll
    public void setSolution() {
        solution = new Solution41();
    }

    /**
     * Input: nums = [1,2,0] Output: 3 Explanation: The numbers in the range [1,2] are all in the
     * array.
     */
    @Test
    public void testCase1() {

        int[] nums = new int[] {1, 2, 0};

        int ans = solution.firstMissingPositive(nums);
        int expect = 3;

        Assertions.assertEquals(ans, expect);
    }

    /*
    Input: nums = [3,4,-1,1]
    Output: 2
    Explanation: 1 is in the array but 2 is missing.
     */
    @Test
    public void testCase2(){
        int[] nums = new int[]{3,4,-1,1};
        int ans = solution.firstMissingPositive(nums);
        int expect = 2;

        Assertions.assertEquals(ans , expect);
    }
}
