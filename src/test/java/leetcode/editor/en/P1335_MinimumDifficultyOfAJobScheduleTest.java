package leetcode.editor.en;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class P1335_MinimumDifficultyOfAJobScheduleTest {


    private Solution1335 solution;

    @BeforeAll
    public void setSolution() {
        solution = new Solution1335();
    }

    /**
     Input: words = ["abcd","dcba","lls","s","sssll"]
     Output: [[0,1],[1,0],[3,2],[2,4]]
     Explanation: The palindromes are ["abcddcba","dcbaabcd","slls","llssssll"]
     */
    @Test
    public void testCase1(){

        int[] input = new int[]{6,5,4,3,2,1 };

        int ans = solution.minDifficulty(input , 2);
        int expect = 7;

        assertThat(ans).isEqualTo(expect);

    }
}
