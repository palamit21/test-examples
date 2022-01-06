import java.util.HashMap;
import java.util.Map;

public class ExtraCandey {

  public static void main(String[] args) {
    int arr[]={12,1,12};
    int n=3;
    int min=arr[0]+3;//5

    System.out.print(true+" ");

    for (int i = 1; i < arr.length; i++) {
      if((arr[i]+n>min)){
        System.out.print(true+" ");
       // min=arr[i]+n;


      }else {
        System.out.print("false"+" ");
      }
      Map<Integer,Integer> count= new HashMap<Integer,Integer>();

        int cur=count.getOrDefault(1,0);




    }

  }

}
