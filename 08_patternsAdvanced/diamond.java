public class diamond {

    public static void diamond(int height) {
        for (int i = 1; i <= (height/2); i++) {
            for (int j = 1; j <= ((height/2)-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2*i)-1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = (height/2); i >= 1; i--) {
            for (int j = ((height/2)-i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = ((2*i)-1); j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        diamond(8);
    }
}