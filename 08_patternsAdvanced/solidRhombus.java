public class solidRhombus {

    public static void solidRhombus(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= (height-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= height; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        solidRhombus(5);
    }
}