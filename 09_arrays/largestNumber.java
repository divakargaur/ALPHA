public class largestNumber {

    public static int largestNumber(int array[]) {
        // int largest = Integer.MIN_VALUE; -> -infinity
        // Integer.MAX_VALUE; -> +infinity
        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
    
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        System.out.println(largestNumber(array));
    }
}