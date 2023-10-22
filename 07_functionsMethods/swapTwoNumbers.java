public class swapTwoNumbers {
    public static void swap(int a, int b) {     // these are making copies
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        swap(a, b);                             // call by value
        System.out.println(a);
        System.out.println(b);
    }
}
                                                // java  always calls by value