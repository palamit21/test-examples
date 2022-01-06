import java.util.Arrays;

public class MoveNegativeNo {

    public static void main(String[] args) {
        int a[]={-1,-2,4,5,-6};
        int start=0;
        int j=0;

        for (int i = 0; i < a.length; i++) {
            if(a[i]<0){
                if(i != j){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
                j++;

            }

        }
        System.out.println(Arrays.toString(a));
    }
}
