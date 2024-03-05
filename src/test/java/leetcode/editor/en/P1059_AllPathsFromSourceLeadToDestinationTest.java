package leetcode.editor.en;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class P1059_AllPathsFromSourceLeadToDestinationTest {
    private Solution1059 solution;

    @BeforeAll
    public void setSolution() {
        solution = new Solution1059();
    }

    /**
     Input: n = 3, edges = [[0,1],[0,2]], source = 0, destination = 2
     Output: false
     Explanation: It is possible to reach and get stuck on both node 1 and node 2.
     */
    @Test
    public void testCase1(){

        int[][] inputEdges = new int[][] {{0,1} , {0,2}};

        boolean ans = solution.leadsToDestination(3 , inputEdges , 0 , 2);
        boolean expect = false;

        assertThat(ans).isEqualTo(expect);

    }

    /*
    * Input: n = 4, edges = [[0,1],[0,2],[1,3],[2,3]], source = 0, destination = 3
        Output: true
    *
    * */
    @Test
    public void testCase3(){
        int[][] inputEdges = new int[][] {{0,1} , {0,2} , {1,3} , {2,3}};

        boolean ans = solution.leadsToDestination(4 , inputEdges , 0 , 3);
        boolean expect = true;

        assertThat(ans).isEqualTo(expect);
    }
}
