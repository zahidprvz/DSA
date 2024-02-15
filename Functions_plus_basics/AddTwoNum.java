import java.util.Scanner;

public class AddTwoNum {

    public static int addTwoNum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num: ");
        int firstNum = sc.nextInt();

        System.out.print("Enter second num: ");
        int secNum = sc.nextInt();

        System.out.println(addTwoNum(firstNum, secNum));

        sc.close();
    }
}
