import java.util.Arrays;
import java.util.HashMap;

public class ClosestSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,5};
        //2,3,4,5
        int target=12;
       // threeSumClosest(arr,target);
        System.out.println(threeSumClosest(arr,target));
        //twoSum(arr,target);
        System.out.println(Arrays.toString(twoSum(arr,target)));

    }
    public static int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int result = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
               int sum = nums[i] + nums[j] + nums[k];
                //int sum = nums[i] + nums[k];
                int diff = Math.abs(sum - target);

                if(diff == 0) return sum;

                if (diff < min) {
                    min = diff;
                    result = sum;
                }
                if (sum <= target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result;
    }
    public static int[] twoSum(int[] nums, int target) {
        if(nums==null || nums.length<2)
            return new int[]{0,0};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }else{
                map.put(target-nums[i], i);
            }
        }

        return new int[]{0,0};
    }
}
