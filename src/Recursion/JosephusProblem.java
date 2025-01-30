package Recursion;
public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(josephus(5,2));
    }

    static int josephus(int n, int rule){
        if (n == 1) return 0;
        return (josephus(n-1, rule)+rule) % n;
    }
}
