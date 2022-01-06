import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArray {

  public static void main(String[] args) {
    int nums[]={1,2,3,4,0};
    int target[]= {0,1,2,3,0};
    //createTargetArray(nums,target);
    System.out.println(Arrays.toString(createTargetArray(nums,target)));
    System.out.println(Arrays.toString(createTargetArray1(nums,target)));

  }

  private static int[] createTargetArray(int[] nums, int[] index) {
    int target[]=new int [nums.length];
    for (int i = 0; i < index.length; i++) {
      for (int j = target.length-1 ;j >index[i] ; j--) {
        target[j]=target[j-1];

        
      }
      target[index[i]]=nums[i];
      
    }
    return target;

  }
  public static int[] createTargetArray1(int[] nums, int[] index) {
    List<Integer> list = new ArrayList();
    int[] arr = new int[nums.length];
    for(int i = 0; i < nums.length; i++){
      list.add(index[i], nums[i]);
      System.out.println("list "+list);
    }

    for(int i = 0; i < nums.length; i++){
      arr[i] = list.get(i);
    }
    return arr;
  }

}
