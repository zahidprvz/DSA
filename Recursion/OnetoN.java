import java.util.Scanner;

public class OnetoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n: ");
        int n = sc.nextInt();

        System.out.println("Sum of 1 to " + n + " is: " + oneToN(n));

        sc.close();
    }

    public static int oneToN(int n) {
        if(n < 1) {
            return -1;
        }
        if(n == 1) {
            return 1;
        }

        int sum = n + oneToN(n-1);
        return sum;
    }
}
