import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[]={1,4,20,3,10,20,5};
        int target=33;
        solveEfficient(arr, target);
        int []nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));

    }

    public static void solveEfficient(int[] arr, int target) {
        int start = 0, end = 0;

        int currSum = 0;

        while (start < arr.length && end <= arr.length) {
            if (currSum == target) {

                /* as the currSum is equal to target sum, print the
                 * result with end as end-1.
                 *  because when we added the element at end we
                 *  increased the pointer there only,
                 *  so now we need to subtract 1 because the
                 *  subarray constituting that sum has
                 *   its last pointer one index where end is currently at.
                 */

                System.out.println("starting index : " + start + ", " +
                        "Ending index : " + (int) (end - 1));

               if (end <= arr.length - 1) {
                    currSum += arr[end];
                }
                end++;

            }

            else {
                /* if the currSum becomes more than required,
                 * we keep on subtracting the start element
                 * until it is less than or equal to
                 required target sum. */
                if (currSum > target) {
                    currSum -= arr[start];
                    start++;
                } else {
                    /* we add the last element to our
                     * currSum until our
                     * sum becomes greater than or
                     * equal to target sum.
                     */
                    if (end <= arr.length - 1) {
                        currSum += arr[end];
                    }
                    end++;
                }
            }
        }

    }
    public  static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]),i};
            } else {
                map.put(target - nums[i],i);
            }
        }
        return null;
    }
   // 3+4=7
    //3=7-4

}
