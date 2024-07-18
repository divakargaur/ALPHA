public class zeroOneTriangle {

    public static void zeroOneTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                if (((i+j)%2) != 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        zeroOneTriangle(5);
    }
}