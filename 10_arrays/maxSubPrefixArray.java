public class maxSubPrefixArray {

    public static int[] prefixArray(int array[]) {
        int prefixArray[] = new int[array.length];
        prefixArray[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            prefixArray[i] = prefixArray[i-1] + array[i];
        }
        return prefixArray;
    }

    public static int maxSubPrefixArray(int array[]) {
        int prefix[] = prefixArray(array);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int temp = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if (temp > max) {
                        max = temp;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int array[] = {1, -2, 6, -1, 3};
        System.out.println(maxSubPrefixArray(array));
    }
}