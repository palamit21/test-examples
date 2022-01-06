public class PrintArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int count=0;
        for (int i=0;i<arr.length;i++){

            if(count== arr.length){
                break;

            }
                System.out.println("["+arr[count]+","+arr[i]+"]");

                if(i== arr.length-1){
                    count++;
                    i=-1;

                }



        }
    }
}
