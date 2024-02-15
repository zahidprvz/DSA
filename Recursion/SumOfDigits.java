import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfDigits sm = new SumOfDigits();

        System.out.print("enter number to find sum of +ve integer: ");
        int number = sc.nextInt();

        System.out.println(sm.sumOfDigits(number));
        sc.close();
    }

    int sumOfDigits(int number) {
        if(number < 0 || number == 0) {
            return 0;
        }
        return number%10 + sumOfDigits(number/10);
    }
}
