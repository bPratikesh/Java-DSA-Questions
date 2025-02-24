package Backtracking;

public class KnightsTour {
    public static void main(String[] args) {

        int n=5;
        int chessBoard[][] = knightsTour(n);
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] knightsTour(int n){
        int chessBoard[][] = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                chessBoard[i][j] = -1;
            }
        }
        chessBoard[0][0] = 0;
        int movesRow[] = {2,1,-1,-2,-2,-1,1,2};
        int movesCol[] = {1,2,2,1,-1,-2,-2,-1};

        knightsTourHelper(n, chessBoard, movesRow, movesCol, 0,0,1);
        return chessBoard;
    }

    static boolean knightsTourHelper(int n, int chessBoard[][], int movesRow[], int movesCol[], int curRow, int curCol, int count){
        if (count == n*n) return true;

        for (int i=0; i<8; i++){
            int nextRow = curRow + movesRow[i];
            int nextCol = curCol + movesCol[i];

            if (isValid(n, chessBoard, nextRow, nextCol)){
                chessBoard[nextRow][nextCol] = count;

                boolean isTourCompleteByGoingThere = knightsTourHelper(n, chessBoard, movesRow, movesCol, nextRow, nextCol, count+1);
                if (isTourCompleteByGoingThere){
                    return true;
                }
                else {
                    chessBoard[nextRow][nextCol] = -1;
                }
            }
        }
        return false;
    }

    static boolean isValid(int n, int chessBoard[][], int row, int col){
        if(row>=0 && col>=0 && row<n && col<n && chessBoard[row][col]==-1) return true;
        return false;
    }
}
