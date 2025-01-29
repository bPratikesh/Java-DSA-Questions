package Recursion;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        System.out.println(arraySortedOrNot(arr, arr.length));
    }
    static boolean arraySortedOrNot(int[] arr, int n){
        if (n == 0 || n == 1 ) return true;
        if (arr[n-1] < arr[n-2]) return false;
        return arraySortedOrNot(arr, n-1);
    }
}
