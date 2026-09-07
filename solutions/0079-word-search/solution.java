class Solution {

    public boolean dfs(char[][] board,int row,int col,String word,int idx) {
        if (idx == word.length()) {
            return true;
        }
        if (row < 0 ||col < 0 ||row >= board.length ||col >= board[0].length ||board[row][col] != word.charAt(idx)) {

            return false;
        }
        char temp = board[row][col];
        board[row][col] = '#';
        boolean found =
                dfs(board, row + 1, col, word, idx + 1) ||
                dfs(board, row - 1, col, word, idx + 1) ||
                dfs(board, row, col + 1, word, idx + 1) ||
                dfs(board, row, col - 1, word, idx + 1);
        board[row][col] = temp;
        return found;
    }

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, i, j, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }
}
