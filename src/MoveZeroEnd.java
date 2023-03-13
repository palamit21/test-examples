import java.util.Arrays;

public class MoveZeroEnd {

  public static void main(String[] args) {

    int nums[] = {1, 4, 0, 0, 2, 7, 0, 6, 0, 9};
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        j++;
      }
    }
    System.out.println("FIRST  "+Arrays.toString(nums));
    moveZeroFirst(nums);

  }

  private static void moveZeroFirst(int[] nums) {
    int j=0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        j++;
      }
    }
    System.out.println("SECOND  "+Arrays.toString(nums));
  }

}
