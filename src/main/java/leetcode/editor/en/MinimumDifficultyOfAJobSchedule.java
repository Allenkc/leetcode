package leetcode.editor.en;

//P1335_Minimum Difficulty of a Job Schedule

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1335 {

    private int numberOfJobs;
    private int totalDays;

    private int[] maxDiffInRemainJobs;
    private int[][] memo;

    private int[] jobDifficulty;
    public int minDifficulty(int[] jobDifficulty, int d) {

        numberOfJobs = jobDifficulty.length;
        totalDays = d;
        this.jobDifficulty = jobDifficulty;

        if(numberOfJobs < totalDays){
            return -1;
        }

        maxDiffInRemainJobs = new int[numberOfJobs];
        int tempMax = Integer.MIN_VALUE;
        for(int i = numberOfJobs - 1 ; i >= 0 ; i--){
            tempMax = Math.max(tempMax , jobDifficulty[i] );
            maxDiffInRemainJobs[i] = tempMax;
        }

        memo = new int[numberOfJobs][totalDays];
        for(int i = 0 ; i < numberOfJobs ; i++){
            Arrays.fill(memo[i] , -1 );
        }

        return dp(0 , 1);

    }

    private int dp(int startIndexOfJobs , int day){

        if(day == totalDays){
            return maxDiffInRemainJobs[startIndexOfJobs];
        }


        if (memo[startIndexOfJobs][day] == -1) {
            int best = Integer.MAX_VALUE;
            int hardest = 0;
            // Iterate through the options and choose the best
            for (int i = startIndexOfJobs; i < numberOfJobs - (totalDays - day); i++) {
                hardest = Math.max(hardest, jobDifficulty[i]);
                // Recurrence relation
                best = Math.min(best, hardest + dp(i + 1, day + 1));
            }
            memo[startIndexOfJobs][day] = best;
        }

        return memo[startIndexOfJobs][day];

    }
}
//leetcode submit region end(Prohibit modification and deletion)
