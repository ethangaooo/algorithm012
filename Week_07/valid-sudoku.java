class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character> rowSet = new HashSet<>();
        HashSet<Character> colSet = new HashSet<>();
        HashSet<String> boxSet = new HashSet<>();

        for (int rowCnt = 0; rowCnt < board.length; rowCnt++) {

            for (int colCnt = 0; colCnt < board[rowCnt].length; colCnt++) {

                if (board[rowCnt][colCnt] != '.') {
                    if (!rowSet.contains(board[rowCnt][colCnt]))
                        rowSet.add(board[rowCnt][colCnt]);
                    else
                        return false;

                    if (!boxSet.contains(rowCnt/3 + "-" + colCnt/3 + "-" + board[rowCnt][colCnt]))
                        boxSet.add(rowCnt/3 + "-" + colCnt/3 + "-" + board[rowCnt][colCnt]);
                    else
                        return false;
                }

                if (board[colCnt][rowCnt] != '.') {
                    if (colSet.contains(board[colCnt][rowCnt]))
                        return false;
                    else
                        colSet.add(board[colCnt][rowCnt]);
                }

            }
            rowSet.clear();
            colSet.clear();
        }
        return true;
    }
}