public class invertedRotatedHalfPyramid{

    public static void invertedRotatedHalfPyramid(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= (height-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void main(String args[]) {
        invertedRotatedHalfPyramid(4);
    }
}