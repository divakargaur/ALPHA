// the array should be sorted to use binary search

public class binarySearch {

    public static int binarySearch(int array[], int key) {
        int start = 0, end = array.length-1;
        while (start <= end) { 
            int mid = (start+end)/2;

            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                start = mid+1;
            }
            if (array[mid] > key) {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println("index of the key is: " + binarySearch(array, key));
    }
}