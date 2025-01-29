package Recursion;

public class FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
    static int factorial(int n){
        if (n <= 0) return 1;
        return n * factorial(n-1);
    }
}
