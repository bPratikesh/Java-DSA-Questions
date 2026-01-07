package Array;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int a[] = {6,1,2,9,4,7};
        waveArrayNotLexographically(a);
        for (int e: a){
            System.out.print(e+" ");
        }
    }
    //lexographically sorted
    static void waveArray(int a[]){
        Arrays.sort(a);

        for (int i=1; i<a.length; i+=2){
            int temp =  a[i];
            a[i] = a[i-1];
            a[i-1] = temp;
        }
    }
    static void waveArrayNotLexographically(int a[]){
        for (int i=1; i<a.length; i+=2){
            if (a[i] > a[i-1]){
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
            if (i<a.length-1 && a[i] > a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
    }
}