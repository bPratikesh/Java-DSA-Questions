package Recursion;

public class NumberOfMatrixPaths {
    public static void main(String[] args) {
        System.out.println(matrixPaths(4,4));
    }
    static int matrixPaths(int row, int col){
        if (row == 1 || col == 1) return 1;
        return matrixPaths(row, col-1) + matrixPaths(row-1, col);
    }
}
