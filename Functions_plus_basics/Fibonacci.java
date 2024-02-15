import java.util.Scanner;

public class Fibonacci {
    public static int[] fibonacci(int number) {
        int[] result = new int[number];
        result[0] = 0;
        result[1] = 1;


        for(int i = 2; i < number; ++i) {
            result[i] = result[i-1] + result[i-2];            
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number for fibonacci series: ");
        int number = sc.nextInt();

        int[] result = fibonacci(number);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}