import java.util.Arrays;

public class ReplaceWithNextInt {
    public static void main(String[] args) {
        int a[]={1,7,8,2};
        int max=a[a.length-1];
        for (int i=a.length-2;i>=0;i--){
            if(a[i]<max){
                a[i]=max;

            }else if(a[i]>max) {
                max=a[i];
            }

        }
        System.out.println(Arrays.toString(a));
    }

}
