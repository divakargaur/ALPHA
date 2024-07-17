/*
 * Multiple functions with the same name but different parameters
 * Function does not depends on return type
 */

public class functionOverloading {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {    // different parameters
        return a + b + c;
    }
    public static float sum(float a, float b) {     // different return type
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3, 5, 7));
        System.out.println(sum(3.0f, 5.0f));
    }
}