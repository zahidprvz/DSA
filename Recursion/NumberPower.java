import java.util.Scanner;

public class NumberPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberPower np = new NumberPower();

        System.out.print("Enter number for base: ");
        int base = sc.nextInt();

        System.out.print("Enter number for poewr: ");
        int power = sc.nextInt();

        System.out.println(np.findPower(base, power));

        sc.close();
    }
    int findPower(int base, int power) {
        if(power == 0 || power == 1) {
            return base;
        }
        if(power < 0) {
            return -1;
        }
        return base * findPower(base, power-1);
    }
}
