package Recursion;

public class SumOfnNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbers(11));
    }

    static int sumOfNaturalNumbers(int n){
        if (n == 1) return 1;
        return sumOfNaturalNumbers(n-1) + n;
    }
}