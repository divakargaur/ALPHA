import java.util.Scanner;

public class binomialCoefficient {
    public static int factorial(int n) {
        if (n==0) {
            return 1;
        }
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac*=i;
        }
        return fac;
    }
    public static int binomial(int n, int r) {
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binomial(n, r));
    }
}
