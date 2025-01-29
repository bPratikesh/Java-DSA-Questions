package Recursion;

public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(pow(10,2));
    }
    static int pow(int x, int n){
        if (n == 0) return 1;
        if (n%2 == 0) return pow(x*x, n/2);
        return pow(x, n-1) * x;
    }

}
