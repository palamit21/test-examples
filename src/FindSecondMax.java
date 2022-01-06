public class FindSecondMax {
    public static void main(String[] args) {
        int arr[]={2,3,9,5,8};
        int max=arr[0];
        int secondMax=arr[0];
        for (int i = 0; i < arr.length; i++) {
            /* If current element is greater than
            first then update both first and second */
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }

            /* If arr[i] is in between first and
               second then update second  */
            else if (arr[i] > secondMax && arr[i] != max)
                secondMax = arr[i];
        }

        System.out.println(max+"   "+secondMax);
    }
}
