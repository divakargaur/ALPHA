public class butterfly {

    public static void butterfly(int height) {
        for (int i = 1; i <= (height/2); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (height-(2*i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = (height/2); i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int j = (height-(2*i)); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        butterfly(8);
    }
}