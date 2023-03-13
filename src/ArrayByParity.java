import java.util.Arrays;

public class ArrayByParity {

  public static void main(String[] args) {
    int arr[]={3,1,2,4};
    //Output: [2,4,3,1]

    int arr1[]={1,1,0,0,3,0};
    System.out.println(Arrays.toString(sortArrayByParity(arr)));
    System.out.println(Arrays.toString(sortArrayByParity1(arr1)));


  }
  public static  int[] sortArrayByParity1(int[] A) {
    int i=0;
    for (int j = 0; j < A.length; j++)
      if (A[j] == 0) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;;
        i++;
      }
    return A;
  }
  public static  int[] sortArrayByParity(int[] A) {
    for (int i = 0, j = 0; j < A.length; j++)
      if (A[j] % 2 == 0) {
        int tmp = A[i];
        A[i++] = A[j];
        A[j] = tmp;;
      }
    return A;
  }

}
