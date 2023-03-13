public class MaxSubArray {

  public static void main(String[] args) {
   int[] nums = {5,4,-1,7,8};
    System.out.println(maxSubArray(nums));
  }
  public static int maxSubArray(int[] nums) {
    if (nums == null || nums.length == 0) return 0;
    boolean isAllNegative = true;
    int minNegative = Integer.MIN_VALUE;
    int currentSum = 0;
    int maxSum = 0;
    for (int current: nums) {
      if (current > 0) isAllNegative = false;
      if (current > minNegative && isAllNegative){
        minNegative = current;
      }
      currentSum = currentSum + current;
      if (currentSum < 0) currentSum = 0;
      if (currentSum > maxSum) maxSum = currentSum;
    }
    return isAllNegative ? minNegative : maxSum;
  }

}
