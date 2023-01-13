package leetcode.editor.en;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class P336_PalindromePairsTest {
    private Solution336 solution;

    @BeforeAll
    public void setSolution() {
        solution = new Solution336();
    }

    /**
     Input: words = ["abcd","dcba","lls","s","sssll"]
     Output: [[0,1],[1,0],[3,2],[2,4]]
     Explanation: The palindromes are ["abcddcba","dcbaabcd","slls","llssssll"]
     */
    @Test
    public void testCase1(){

        String[] input = new String[]{"abcd" , "dcba" , "lls" , "s" , "sssll" };

        List<List<Integer>> ans = solution.palindromePairs(input);
        List<List<Integer>> expect = new ArrayList<>();

        expect.add(Arrays.asList(0,1));
        expect.add(Arrays.asList(1,0));
        expect.add(Arrays.asList(3,2));
        expect.add(Arrays.asList(2,4));

        Assertions.assertIterableEquals(ans, expect);

    }

}
