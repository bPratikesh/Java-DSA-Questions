package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String s = "r";
        System.out.println(palindromeOrNot(s, 0, s.length()-1));
    }

    static boolean palindromeOrNot(String s, int left, int right){
        if (left >= right) return true;
        if (s.charAt(left) == s.charAt(right)){
            return palindromeOrNot(s, left+1, right-1);
        }
        else return false;
    }

}
