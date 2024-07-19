public class reverseArray {

    public static void reverseArray(int array[]) {
        int first = 0, last = array.length-1;

        while (first < last) { 
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;

            first++; last--;
        }
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};

        reverseArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}