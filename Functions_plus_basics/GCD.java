import java.util.Scanner;

public class GCD {
    public static int gcd(int num1, int num2) {
        int result = 0;

        for(int i = 1; i <= num1 && i <= num2; i++) {
            if(num1%i==0 && num2%i ==0) {
                result = i;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to find GCD between: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = gcd(num1, num2);

        System.out.printf("GCD between %d and %d is %d", num1, num2, result);

        System.out.println("");

        sc.close();
    }
}
