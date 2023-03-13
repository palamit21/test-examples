import java.util.ArrayList;

public class FirstNegativeNo {

  static ArrayList<Integer> list=new ArrayList<Integer>();
  public static void main (String[] args) {
    Integer arr[] = { 12, 2, 1, 8, -15, 30, 16, 28 };

    ArrayList<Integer> al = new ArrayList<Integer>();
    firstNegative(arr,3,al);
  }


  public static void firstNegative(Integer arr[], int K, ArrayList<Integer> list){
    int i=0, j=0;
    while(j<arr.length){
      if(arr[j]<0){
        list.add(arr[j]);
      }

      if(j-i+1<K)
        j++;

      else{
        if(list.size()==0)
          System.out.print(0+" ");
        else{
          System.out.print(list.get(0)+" ");
          if(arr[i]==list.get(0)){
            list.remove(0);
          }
        }
        i++;
        j++;
      }

    }
  }

}
