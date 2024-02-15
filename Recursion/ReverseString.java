import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string to reverse: ");
        String str = sc.nextLine();

        reverseString(str);
        
        sc.close();
    }

    public static void reverseString(String str) {
        
        if(str == null || str.length() <= 1) {
            System.out.println(str);
        } else {
            System.out.print(str.charAt(str.length()-1));
            reverseString(str.substring(0, str.length()-1));
        }
    }
}
