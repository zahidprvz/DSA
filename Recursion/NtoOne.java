import java.util.Scanner;

public class NtoOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number for n: ");
        int n = sc.nextInt();

        nToOne(n);

        sc.close();
    }
    public static void nToOne(int n) {
        if(n > 0) {
            nToOne(n-1);
            System.out.print(n + " ");
        }
        return;
    }
}
