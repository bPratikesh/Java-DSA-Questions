package Backtracking;

public class PermutationOfArray {
    public static void main(String[] args) {

    }
    static void printArray(int[] a){
        for (int e: a){
            System.out.print(e+" ");
        }
    }
    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
