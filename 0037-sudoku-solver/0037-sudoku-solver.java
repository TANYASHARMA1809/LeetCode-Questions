class Solution {
    public void solveSudoku(char[][] board) {
        SudokuSolver(board, 0, 0);
    }

    public static boolean SudokuSolver(char[][] grid, int row, int col) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (row == 9) {
            Display(grid);
            return true;  // Solution found
        }
        if (grid[row][col] != '.') {
            return SudokuSolver(grid, row, col + 1);
        } else {
            for (char val = '1'; val <= '9'; val++) {
                if (isitpossible(grid, row, col, val)) {
                    grid[row][col] = val;
                    if (SudokuSolver(grid, row, col + 1)) {
                        return true;  // Stop after finding a solution
                    }
                    grid[row][col] = '.'; // undo
                }
            }
        }
        return false;  // No solution found
    }

    public static boolean isitpossible(char[][] grid, int row, int col, char val) {
        // Check the row
        for (int c = 0; c < 9; c++) {
            if (grid[row][c] == val) {
                return false;
            }
        }
        // Check the column
        for (int r = 0; r < 9; r++) {
            if (grid[r][col] == val) {
                return false;
            }
        }
        // Check the 3x3 sub-box
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (grid[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void Display(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
