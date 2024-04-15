package leetcode.editor.en;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class P33_SearchInRotatedSortedArray {
    private Solution33 solution33;

    @BeforeAll
    public void setSolution() {
        solution33 = new Solution33();
    }

    /*
    *
    * Input: nums = [4,5,6,7,0,1,2], target = 0
        Output: 4
    *
    * */
    @Test
    public void testCase1(){
        int[] inputArr = new int[]{4,5,6,7,0,1,2};
        int target = 0;

        int result = solution33.search(inputArr , target);

        int expect = 4;

        assertThat(result).isEqualTo(expect);
    }

    @Test
    public void testCase4(){
        int[] inputArr = new int[]{3,1};
        int target = 1;

        int result = solution33.search(inputArr , target);

        int expect = 1;

        assertThat(result).isEqualTo(expect);
    }
}
