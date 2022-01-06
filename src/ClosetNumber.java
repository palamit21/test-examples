public class ClosetNumber {
    private static int getClosetNumberOfTarget(int[] dataArray, int target) {

        // Edge case - Check if array length is zero
        if (dataArray.length == 0)
            System.exit(1);
        // Straight case - If target is smaller or equal to first element in array
        if (target <= dataArray[0])
            return dataArray[0];
        // Straight case - If target is greater or equal to last element in array
        if (target >= dataArray[dataArray.length - 1])
            return dataArray[dataArray.length - 1];

        // Start binary search algorithm
        int start = 0;
        int end = dataArray.length-1;
        int mid = 0;

        // Keep dividing array till further division is not possible
        while (end - start != 1) {
            // Calculate middle index
            mid = (start + end) / 2;
            // Check if middle element is equal to target
            if (target == dataArray[mid])
                // If yes return middle element as middle element = target
                return dataArray[mid];
            // Check if target is smaller to middle element. If yes, take first half of array including mid
            if (target < dataArray[mid])
                end = mid;
            // Check if target is greater to middle element. If yes, take first half of array including mid
            if (target > dataArray[mid])
                start = mid;
        }
        // Now you will have only two numbers in array in which target number will fall
        return Math.abs(target - dataArray[start]) <= Math.abs(target - dataArray[end]) ? dataArray[start]
                : dataArray[end];
    }

    public static void main(String[] args) {

        int b[] = { 1, 2, 5, 6 };
        System.out.println(getClosetNumberOfTarget(b, 3));
        System.out.println(getClosetNumberOfTarget(b, -5));
        System.out.println(getClosetNumberOfTarget(b, 27));
        System.out.println(getClosetNumberOfTarget(b, 23));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        int c[] = { 1, 2, 4, 5, 6, 20, 26 };
        System.out.println(getClosetNumberOfTarget(c, 11));
        System.out.println(getClosetNumberOfTarget(c, -5));
        System.out.println(getClosetNumberOfTarget(c, 27));
        System.out.println(getClosetNumberOfTarget(c, 23));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        int e[] = { 16, 19, 26, 34, 51, 98, 256 };
        System.out.println(getClosetNumberOfTarget(e, 30));
        System.out.println(getClosetNumberOfTarget(e, 31));
        System.out.println(getClosetNumberOfTarget(e, 27));
        System.out.println(getClosetNumberOfTarget(e, 23));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        int a[] = { -10, -6, 6, 14, 41, 58, 99 };
        System.out.println(getClosetNumberOfTarget(a, -8));
        System.out.println(getClosetNumberOfTarget(a, 0));
        System.out.println(getClosetNumberOfTarget(a, 27));
        System.out.println(getClosetNumberOfTarget(a, 10));
    }

}

