import java.util.Arrays;

public class LeftRightArray {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 5 };
        int leftArray[]= new int[arr.length];
        leftArray[0]=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            leftArray[i]= leftArray[i-1]+arr[i];

        }
        System.out.println(Arrays.toString(leftArray));
        int rightArray[]= new int[arr.length];

        rightArray[arr.length - 1]=arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--)
        {
            rightArray[i]= rightArray[i+1]+arr[i];

        }
        System.out.println(Arrays.toString(rightArray));
        for (int i = 1; i < arr.length - 1; i++)
            if (rightArray[i] == leftArray[i])
                System.out.println(arr[i]);


    }
}
