import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter you number: ");
            int n = sc.nextInt();
            if (n%10 == 0) {
                continue;
            }
            System.out.println(n);
        } while (true);
    }
}
