public class Countpais1 {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 5, 7, -1, 5 };

        int end=arr.length-1;
        int start=0;
        int sum=6;
        int count=0;

        while (start<end){
            if(arr[start]+arr[end]<sum){
                start++;

            }
            else if(arr[start]+arr[end]>sum){
                end++;

            }else {
                System.out.println(""+arr[start]+"  "+arr[end]);
                count++;
                end--;
            }


        }
        System.out.println(count);

    }
}
