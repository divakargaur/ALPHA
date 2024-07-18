public class hollowRhombus {

    public static void hollowRhombus(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= (height-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= height; j++) {
                if (i==1 || i==height || j==1 || j==height) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        hollowRhombus(5);
    }
}