package Array;

public class MultipleLeftRotation {
    public static void main(String[] args) {
        int a[] ={1,2,3,4};
        int b[] = {2,3};
        int ans[][] = multipleRotations(a, b);
        for (int e[]: ans){
            printArray(e);
            System.out.println();
        }
    }

    static int [][] multipleRotations(int numbers[], int queries[]){
        int m= queries.length;
        int n= numbers.length;

        int finalAnswer[][] = new int[m][n];

        int tempArr[]= new int[2*n];
        for (int i=0; i<n; i++){
            tempArr[i] = numbers[i];
            tempArr[i+n]= numbers[i];
        }

        for (int i=0; i<m; i++){
            int offSet=(queries[i])%n;
            for (int j=0; j<n; j++){
                finalAnswer[i][j]=tempArr[j+offSet];
            }
        }
        return finalAnswer;
    }

    static void rotateByK(int a[], int k){
        int n=a.length;
        for (int i=0; i<k; i++){
            int temp=a[0];
            for (int j=0; j<n-1; j++){
                a[j] = a[j+1];
            }
            a[n-1]=temp;
        }
    }

    static void printArray(int a[]){
        for (int e: a){
            System.out.print(e+" ");
        }
    }


}
