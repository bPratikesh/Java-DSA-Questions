package Backtracking;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n=3;
        generateParenthesis("", n, 0, 0, 0);
    }

     static void generateParenthesis(String cur, int n, int index, int open, int close){
        if (index == 2*n){
            System.out.println(cur);
            return;
        }
        if(open<n){
            cur = cur+"(";
            generateParenthesis(cur, n, index+1, open+1, close);
            cur=cur.substring(0, cur.length()-1);
        }

        if(close<open){
            cur = cur+")";
            generateParenthesis(cur, n, index+1, open, close+1);
        }

     }

}
