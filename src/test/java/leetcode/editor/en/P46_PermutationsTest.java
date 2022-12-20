package leetcode.editor.en;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class P46_PermutationsTest {
    private Solution46 solution;

    @BeforeAll
    public void setSolution() {
        solution = new Solution46();
    }

    @Test
    public void testCase1(){
/**
 Input: nums = [1,2,3]
 Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */

        List<List<Integer>> answer = solution.permute(new int[]{1,2,3,});

        List<List<Integer>> expect = new ArrayList<>();
        expect.add(new ArrayList<>(Arrays.asList(1,2,3)));
        expect.add(new ArrayList<>(Arrays.asList(1,3,2)));
        expect.add(new ArrayList<>(Arrays.asList(2,1,3)));
        expect.add(new ArrayList<>(Arrays.asList(2,3,1)));
        expect.add(new ArrayList<>(Arrays.asList(3,1,2)));
        expect.add(new ArrayList<>(Arrays.asList(3,2,1)));

        Assertions.assertIterableEquals(answer, expect);
    }

}
