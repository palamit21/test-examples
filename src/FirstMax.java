import java.util.ArrayList;

public class FirstMax {
  static ArrayList<Integer> list=new ArrayList<Integer>();
  public static void main (String[] args) {
    Integer arr[] = { 12, 9, -7, -3, -15, 30, 16, 28 };
    ArrayList<Integer> al = new ArrayList<Integer>();
    firstNegative(arr,3,al);
  }


  public static void firstNegative(Integer arr[], int K, ArrayList<Integer> list){
    int i=0, j=0;
    int max=-1;
    while(j<arr.length){
      max = Math.max(max, arr[j]);
      if(j-i+1<K)
        j++;
      else{
        System.out.println(max);

        i++;
       // j++;
        max=arr[i];

      }

    }
  }


}
