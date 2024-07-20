public class maxSubKadane {

    public static int maxSubKadane(int array[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        /*int maxElem = Integer.Min_Value; -> for all negative numbers*/

        for (int i = 0; i < array.length; i++) {
            // currSum = Math.max(currSum + array[i], 0)
            if (currSum + array[i] > 0) {
                currSum += array[i];
            }
            // maxSum = Math.max(currSum, maxSum)
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            /*maxElem = Math.max(maxElem, array[i])*/
            /*return Math.max(maxElem, maxSum)*/
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(maxSubKadane(array));
    }
}