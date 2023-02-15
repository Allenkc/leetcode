package leetcode.editor.en;

// P51_N-Queens

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// leetcode submit region begin(Prohibit modification and deletion)
class Solution51 {
    private int size;
    private final List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        size = n;
        // Initialize an empty chess board in 2-D char array
        char[][] emptyChessboard = new char[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                emptyChessboard[row][col] = '.';
            }
        }

        backtrack(0, new HashSet<>(), new HashSet<>(), new HashSet<>(), emptyChessboard);
        return result;
    }

    private void backtrack(
            int row,
            Set<Integer> cols,
            Set<Integer> diagonals,
            Set<Integer> antiDiagonals,
            char[][] state) {
        // Termination condition , stop the recursion and record the possible solution
        if (row == size) {
            result.add(convertToBoard(state));
        }

        // we currently on a specific row , so start to iterate the columns to check if the position is available to place a Queen
        for (int col = 0; col < size; col++) {
            int currentDiagonal = row - col;
            int currentAntiDiagonal = row + col;
            // no need to check if state[row][col] == 'Q' here , this will cause the error and make the program exception
            if (cols.contains(col)
                    || diagonals.contains(currentDiagonal)
                    || antiDiagonals.contains(currentAntiDiagonal)) {
                continue;
            }

            // backtracking
            state[row][col] = 'Q';
            cols.add(col);
            diagonals.add(currentDiagonal);
            antiDiagonals.add(currentAntiDiagonal);

            backtrack(row + 1, cols, diagonals, antiDiagonals, state);

            state[row][col] = '.';
            cols.remove(col);
            diagonals.remove(currentDiagonal);
            antiDiagonals.remove(currentAntiDiagonal);
        }
    }

    private List<String> convertToBoard(char[][] state) {
        List<String> board = new ArrayList<>();
        for (int row = 0; row < size; row++) {
            // Construct a String from array of Characters
            String currentRowStr = new String(state[row]);
            board.add(currentRowStr);
        }

        return board;
    }
}
// leetcode submit region end(Prohibit modification and deletion)
