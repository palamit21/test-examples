import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[]={2,4,6,5,5};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                int tmp = 0;
                if (arr[i] < arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);

                }


                }

            }


        }

    }

