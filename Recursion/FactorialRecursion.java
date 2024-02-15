import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for factorial: ");
        int number = sc.nextInt();

        int result = factorial(number);

        System.out.print("Factorial of given number is: " + result);

        sc.close();
    }
    public static int factorial(int number) {
        if(number < 0) {
            return -1;
        } else if(number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}