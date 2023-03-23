package LogicQuestions;

public class SudokuValidator {
    public boolean isValidSudoku(char[][] board) {
        // Check rows and columns
        for (int i = 0; i < 9; i++) {
            boolean[] rowSeen = new boolean[9];
            boolean[] colSeen = new boolean[9];
            for (int j = 0; j < 9; j++) {
                // Check row
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (rowSeen[num]) {
                        return false;
                    }
                    rowSeen[num] = true;
                }
                // Check column
                if (board[j][i] != '.') {
                    int num = board[j][i] - '1';
                    if (colSeen[num]) {
                        return false;
                    }
                    colSeen[num] = true;
                }
            }
        }

        // Check 3x3 boxes
        for (int box = 0; box < 9; box++) {
            boolean[] boxSeen = new boolean[9];
            int rowStart = (box / 3) * 3;
            int colStart = (box % 3) * 3;
            for (int i = rowStart; i < rowStart + 3; i++) {
                for (int j = colStart; j < colStart + 3; j++) {
                    if (board[i][j] != '.') {
                        int num = board[i][j] - '1';
                        if (boxSeen[num]) {
                            return false;
                        }
                        boxSeen[num] = true;
                    }
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        SudokuValidator validator = new SudokuValidator();
        char[][] board = {{'.','3','.','.','7','.','.','.','.'},
                          {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','8','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}};
        boolean isValid = validator.isValidSudoku(board);
        System.out.println(isValid);
    }

}

