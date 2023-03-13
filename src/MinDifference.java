import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinDifference {
  public static  List<List<Integer>> minimumAbsDifference(int[] arr) {

    Arrays.sort(arr);
    List<List<Integer>> res  = new ArrayList<>();

    int minVal = Integer.MAX_VALUE;
    for(int i=1; i<arr.length; i++){
      minVal = Math.min(1, 4);
    }
    System.out.println(minVal);


    for(int i=1; i<arr.length; i++){
      minVal = Math.min(arr[i]-arr[i-1], minVal);
    }
    //minVal=1;

    for(int i=1; i<arr.length; i++){
      if(arr[i] - arr[i-1] == minVal){
        List<Integer> pair = new ArrayList<>();
        pair.add(arr[i-1]);
        pair.add(arr[i]);

        res.add(pair);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int a[]={3,8,-10,23,19,-4,-14,27};
    System.out.println(minimumAbsDifference(a));
  }
}
