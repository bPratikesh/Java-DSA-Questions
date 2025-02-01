package Backtracking;

public class RatInaMaze {
    public static void main(String[] args) {

        int matrix[][] = {
                {1,1,0,1},
                {0,1,1,0},
                {0,1,1,0},
                {1,0,1,1}
        };

        int row = matrix.length;
        int col = matrix[0].length;

        boolean visited[][] = new boolean[row][col];
        visited[0][0]=true;
        ratInMaze(matrix, visited, 0, 0, "", row, col);
    }

    static boolean isValid(int i, int j, int matrix[][], boolean visited[][], int row, int col){
        if (i < row && i >= 0 && j < col && j >=0 && matrix[i][j] == 1 && !visited[i][j]) return true;
        return false;
    }

    static void ratInMaze(int matrix[][], boolean visited[][], int i, int j, String path, int row, int col){
        if (i == row-1 && j == col-1) {     //base case(bottom right corner reached)
            System.out.println(path);
            return;
        }

        if (isValid(i+1, j, matrix, visited, row, col)){            //Down
            visited[i+1][j] = true;
            ratInMaze(matrix, visited, i+1, j, path+'D', row, col);
            visited[i+1][j] = false;
        }

        if (isValid(i, j-1, matrix, visited, row, col)){            //Left
            visited[i][j-1] = true;
            ratInMaze(matrix, visited, i, j-1, path+'L', row, col);
            visited[i][j-1] = false;
        }

        if (isValid(i, j+1, matrix, visited, row, col)){            //Right
            visited[i][j+1] = true;
            ratInMaze(matrix, visited, i, j+1, path+'R', row, col);
            visited[i][j+1] = false;
        }

        if (isValid(i-1, j, matrix, visited, row, col)){            //Up
            visited[i-1][j] = true;
            ratInMaze(matrix, visited, i-1, j, path+'U', row, col);
            visited[i-1][j] = false;
        }









    }

}