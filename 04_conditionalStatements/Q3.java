import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i < 500000) {
            System.out.println("0");
        } else if (i >= 500000 && i < 1000000) {
            System.out.println((int)(i*0.2));
        } else {
            System.out.println((int)(i*0.3));
        }
    }
}
