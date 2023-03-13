package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;

public class SumOfArray {

  public static void main(String[] args) {
    int arr[]={1,4,20,3,10,20,5};
    int sum=33;
    System.out.println("largest sub Array  "+largestSubarray(arr,33));

    System.out.println("length of longest sub array  "+lenOfLongSubarr(arr,arr.length,33));
     int arr1[]={7, 4, -1, -3, 5, 3, 6, 7};
    int arr2[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
    System.out.println("largest sub Array 2nd"+maxArray(arr1,arr1.length,3));


  }

  static  int largestSubarray(int[] arr, int k){
    int max = 0, sum = 0, i = 0, j = 0;
    while(j < arr.length){
      sum += arr[j];
      if(sum < k){
        j++;
      }
      else if(sum == k){
        System.out.println(i+"  "+j);
        max = Math.max(max, j - i + 1);
        j++;
      }
      else{
        while(sum > k){
          sum -= arr[i];
          i++;
          if(sum == k){
            System.out.println(i+"  "+j);

            max = Math.max(max, j - i + 1);
          }
        }
        j++;
      }
    }
    return max;
  }

  static ArrayList maxArray(int[] arr, int n, int k)
  {
    int i = 0, j = 0;
    int max = Integer.MIN_VALUE;
    ArrayList<Integer> al = new ArrayList<>();
    while(j < n) {
      max  = Math.max(arr[j], max);
      if(j - i + 1 < k)
        j++;

      else if(j - i + 1 == k) {
        System.out.println(max);

        al.add(max);
        i++;
        j++;
        max=arr[i];
      }
    }
    return al;
  }
  static int lenOfLongSubarr(int[] arr, int n, int k)
  {
    // HashMap to store (sum, index) tuples
    HashMap<Integer, Integer> map = new HashMap<>();
    int sum = 0, maxLen = 0;

    // traverse the given array
    for (int i = 0; i < n; i++) {

      // accumulate sum
      sum += arr[i];

      // when subarray starts from index '0'
      if (sum == k)
        maxLen = i + 1;

      // make an entry for 'sum' if it is
      // not present in 'map'
      if (!map.containsKey(sum)) {
        map.put(sum, i);
      }

      // check if 'sum-k' is present in 'map'
      // or not
      if (map.containsKey(sum - k)) {

        // update maxLength
        if (maxLen < (i - map.get(sum - k)))
          maxLen = i - map.get(sum - k);
      }
    }

    return maxLen;
  }

}
