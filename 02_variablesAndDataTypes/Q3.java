import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float sum = a+b+c;
        System.out.println(sum + (sum*18/100));
    }
}
