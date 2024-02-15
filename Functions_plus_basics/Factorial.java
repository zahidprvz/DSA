import java.util.Scanner;

public class Factorial {
    public static int factorial(int num) {
        
        int fact = 1;
        for(int i = num; i >= 1; i--) {
            fact = i*fact;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number for factorial: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Invalid number!");
            sc.close();
            return;
        } 

        int result = factorial(num);

        System.out.println("Factorial of number is: " + result);

        sc.close();
    }
}
 