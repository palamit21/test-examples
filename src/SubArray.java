import java.util.Arrays;
import java.util.List;

public class SubArray {

  public static void main(String[] args) {
    Integer arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
    int k = 3;
    int n = arr.length;
    System.out.println(maximumSumSubarray(k, Arrays.asList(arr), n));
  }


  static int maximumSumSubarray(int k, List<Integer> arr,int N)
  {
    //Integer arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
    int i=0,j=0;
    int sum=0;
    int max=-1;

    while(j<N)
    {
      sum+=arr.get(j);

      if(j-i+1<k)
      {
        j++;
      }
      else if(j-i+1==k)
      {
        max=Math.max(max,sum);
        System.out.println(sum);
        sum-=arr.get(i);
        i++;
        j++;
      }
    }

    return max;
  }

}
