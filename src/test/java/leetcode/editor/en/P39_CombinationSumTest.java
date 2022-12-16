package leetcode.editor.en;

import leetcode.editor.en.CombinationSum;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class P39_CombinationSumTest {
    private CombinationSum solution;

    @BeforeAll
    public void setSolution() {
        solution = new CombinationSum();
    }

    @Test
    public void testCase1(){
/**
 * Input: candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 * Explanation:
 * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
 * 7 is a candidate, and 7 = 7.
 * These are the only two combinations.
 */

        List<List<Integer>> answer = solution.combinationSum(new int[]{2,3,6,7} , 7);

        List<List<Integer>> expect = new ArrayList<>();
        expect.add(new ArrayList<>(Arrays.asList(2,2,3)));
        expect.add(new ArrayList<>(Arrays.asList(7)));

        Assertions.assertIterableEquals(answer, expect);
    }
}
