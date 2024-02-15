import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GCD gd = new GCD();

        System.out.print("enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("enter second number: ");
        int num2 = sc.nextInt();

        System.out.println(gd.findGCD(num1, num2));

        sc.close();
    }

    int findGCD(int num1, int num2) {
        if(num1 < 0 || num2 < 0) {
            return -1;
        }
        if(num2 == 0) {
            return num1;
        }


        return findGCD(num2, num1%num2);
    }
}
