package Backtracking;

public class PermutationOfArray {
    public static void main(String[] args) {
        int a[] = {6,5,4};
        permute(a,0, a.length-1);
    }

    static void permute(int a[], int left, int right){
        if(left == right){
            printArray(a);
            return;
        }

        for (int i=left; i<=right; i++){
            swap(a, i, left);
            permute(a, left+1, right);
            swap(a, i, left);
        }
    }
    static void printArray(int[] a){
        for (int e: a){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
