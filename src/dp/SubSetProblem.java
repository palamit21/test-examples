package dp;

public class SubSetProblem {
  public static void main(String[] args) {
    int[] arr = {3, 34, 4, 12, 5, 2};
    //{3, 34, 4, 12, 5, 2
        //2, 3, 7, 8, 10
    int sum = 9;
    int n = arr.length;
    System.out.println("Is the sum present in the subset? " + subsetSum(arr, sum, n));
  }
  public static boolean subsetSum(int[] arr, int sum, int n) {
    if (sum > 0 && n == 0) {
      return false;
    }

    if (sum == 0) {
      System.out.println(" "+n);
      return true;
    }

    if (arr[n - 1] <= sum) {
      return subsetSum(arr, sum - arr[n - 1], n - 1) ||
          subsetSum(arr, sum, n - 1);
    } else {
      return subsetSum(arr, sum, n - 1);
    }
  }

}
