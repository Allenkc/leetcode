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

    private Solution227 solution;

    @BeforeAll
    public void setSolution() {
        solution = new Solution227();
    }

    @Test
    public void testCase1(){

        int answer = solution.calculate("42");

        int expect = 42;

        Assertions.assertEquals(answer, expect);
    }

}
