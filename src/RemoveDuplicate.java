import java.util.Arrays;

public class RemoveDuplicate {


  public static  int removeDuplicates(int[] nums) {
    int i = 0;
    for (int n : nums)
      if (i < 2 || n > nums[i-2])
        nums[i++] = n;
    return i;
  }
  static int removeDuplicates(int arr[], int n)
  {
    if (n == 0 || n == 1)
      return n;

    // To store index of next unique element
    int j = 0;

    // Doing same as done in Method 1
    // Just maintaining another updated index i.e. j
    for (int i = 0; i < n-1; i++) {
      if (arr[i] != arr[i + 1]) {
        arr[j++] = arr[i];
      }

    }
    arr[j++] = arr[n - 1];

    return j;
  }

  public static void main(String[] args) {
   int[] nums = {1,1,1,2,2,3};
    System.out.println(removeDuplicates(nums));
    int n=removeDuplicates(nums,nums.length);

    System.out.println(n);
    // Print updated array
    for (int i=0; i<n; i++)
      System.out.print(nums[i]+" ");
  }


}
