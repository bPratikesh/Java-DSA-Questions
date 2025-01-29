package Recursion;

public class CalculateNcR {
    public static void main(String[] args) {
        System.out.println(nCr(5,3));
    }
    static int nCr(int n, int r){
        if (n == r || r == 0) return 1;
        if (r > n) return 0;
        return nCr(n-1, r-1) + nCr(n-1, r);
    }
}
