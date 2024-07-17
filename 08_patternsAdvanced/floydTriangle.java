public class floydTriangle {

    public static void floydTriangle(int height) {
        int n = 1;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        floydTriangle(5);
    }
}