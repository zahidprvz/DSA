import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number to convert into binary: ");
        int decimal = sc.nextInt();

        System.out.println(decimalToBinary(decimal));

        sc.close();
    }

    static int decimalToBinary(int decimal) {
        if(decimal == 0) {
            return 0;   
        }
        return decimal%2 + 10 * decimalToBinary(decimal/2);
    }
}
