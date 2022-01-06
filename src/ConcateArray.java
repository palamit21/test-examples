import java.util.Arrays;

public class ConcateArray {

  public static void main(String[] args) {
    int a[]={1,2,1};
    int k=0;
    int j=0;
    int b[]=new int [a.length];
    for (int i = 0; i < a.length; i++) {
      System.out.print(" "+a[i]);
      if(i==a.length-1 && k==0){
        i=-1;
        k=1;

      }

    }
  int arr[]=  {5,0,1,2,3,4};
    System.out.println("  "+Arrays.toString(b));
    System.out.println(Arrays.toString(getConcatenation(a)));
    System.out.println(Arrays.toString(buildArray(arr)));

  }


  public static int[] getConcatenation(int[] nums) {
    int[] result = new int[nums.length * 2];
    for(int i=0;i<nums.length;i++)
      result[i + nums.length] = result[i] = nums[i];
    return result;
  }
  public static int[] buildArray(int[] nums) {
    //{5,0,1,2,3,4};
    int result[] = new int[nums.length];
    for(int  i=0; i<nums.length; i++){
      result[i] = nums[nums[i]];
    }
    return result;
  }

}
