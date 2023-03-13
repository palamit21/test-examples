import java.util.Arrays;

public class ProductArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int n=a.length;
        int prod[]=new int[a.length];
            int sum=1;
            int temp=1;
            int i=0;
        for (int j = 0; j < n; j++)
            prod[j] = 1;

            for (int j=0;j<a.length;j++){
                prod[j] = temp;
                temp *= a[j];
                System.out.println(temp);
                System.out.println(Arrays.toString(prod));


            }
        temp = 1;

        /* In this loop, temp variable contains product of
           elements on right side excluding arr[i] */
        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= a[i];
            System.out.println("..........."+temp);
            System.out.println(Arrays.toString(prod));

        }

        /* print the constructed prod array */
        for (i = 0; i < n; i++)
            System.out.print(prod[i] + " ");
        System.out.println("---");
        System.out.println(Arrays.toString(productExceptSelf(a)));

        System.out.println(" from second "+Arrays.toString(productExceptSelf1(a)));

    }



    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        //left
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        //right array
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i]*right;
            right = right*nums[i];
        }
        return res;
    }
    private static int[] productExceptSelf1(int[] a) {
        int product=1;
        for (int i = 0; i < a.length; i++) {
            product=product*a[i];

        }
        for (int i = 0; i < a.length; i++) {
            a[i]=product/a[i];

        }

        return a;
    }
}
