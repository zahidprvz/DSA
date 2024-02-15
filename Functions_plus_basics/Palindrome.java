import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        boolean result = false;
        String sample = "";
        char ch;

        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            sample = ch + sample;
        }
        if(str.equals(sample)) {
            result = true;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or string to check for palindrome: ");
        String str = sc.nextLine();

        boolean result = isPalindrome(str);

        System.out.println(result);

        sc.close();
    }
}
