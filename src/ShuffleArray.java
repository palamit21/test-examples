import java.util.Arrays;

public class ShuffleArray {

  public static void main(String[] args) {
    int a[]={7,7,7,7};
   int count = 0;
    int outArray[]=new int[a.length];
    for (int i = 0; i < a.length; i++) {
      int minEle=a[i];
      count=0;
      for (int j = 0; j < a.length; j++) {
        if(minEle>a[j]){
          count++;


        }



      }
      outArray[i]=count;


    }
    System.out.println(Arrays.toString(outArray));


    int arr[][]={{1,2,3},{3,2,4}};
    System.out.println(maximumWealth(arr));


  }


  public static int maximumWealth(int[][] accounts) {
    return Arrays.stream(accounts).mapToInt(i -> Arrays.stream(i).sum()).max().getAsInt();
  }
}
