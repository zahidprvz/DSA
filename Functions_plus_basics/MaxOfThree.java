import java.util.Scanner;

public class MaxOfThree {

    public static int getMax(int num1, int num2, int num3) {
        int max = 0;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        int result = getMax(num1, num2, num3);
        System.out.println("Maximum number is: " + result);
        sc.close();
    }
}
