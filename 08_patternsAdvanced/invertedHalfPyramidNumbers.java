public class invertedHalfPyramidNumbers {

    public static void invertedHalfPyramidNumbers(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= (height-i+1); j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        invertedHalfPyramidNumbers(5);
    }
}