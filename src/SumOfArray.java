import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[]={1,4,20,3,10,20,5};
        int target=33;
        solveEfficient(arr, target);
        int []nums = {5,7,2,10};
        System.out.println(Arrays.toString(twoSum(nums,12)));

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
    public static int[] twoSum(int[] nums, int target) {
        //int []nums = {5,7,2,15};
        if (nums == null || nums.length < 2) return new int[0];
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                result[0] = i;
                result[1] = map.get(nums[i]);
               break;
            } else {
                int diff = (target - nums[i]);
                map.put(diff, i);
            }
        }
        return result;
    }
   // 3+4=7
    //3=7-4

}
