package Recursion;

public class SubsetsOfString {
    public static void main(String[] args) {
        String s = "abc";
        isPalindrome(s);
    }

    static void isPalindrome(String s){
         printSubsetsHelper(s, 0, "");
    }
     static void printSubsetsHelper(String s, int index, String current){
        if (index == s.length()){
            System.out.println(current);
            return;
        }
        printSubsetsHelper(s, index+1, current+s.charAt(index));
        printSubsetsHelper(s, index+1, current);
     }
}
