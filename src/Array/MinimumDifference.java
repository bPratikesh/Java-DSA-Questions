package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MinimumDifference {
    public static void main(String[] args) {
        int[] arr={5,4,2,9,7};
        System.out.println(minDiff(arr));
    }
    public static List<List<Integer>> minDiff(int []arr){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i=1; i<arr.length; i++){
            if(arr[i]-arr[i-1] < minDiff){
                minDiff = arr[i]-arr[i-1];
            }
        }

        for (int i=1; i<arr.length; i++){
            if(arr[i]-arr[i-1] == minDiff) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i - 1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
        }
        return ans;
    }
}
