import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int number) {
        boolean flag = true;

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number%i==0) {
                flag = false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number to check for prime: ");
        int number = sc.nextInt();

        boolean result = isPrime(number);

        if(result == true) {
            System.out.println("Number is prime!");
        } else if(result == false) {
            System.out.println("Number is not prime");
        }

        sc.close();
    }
}
