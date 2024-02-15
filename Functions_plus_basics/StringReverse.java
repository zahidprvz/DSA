import java.util.Scanner;

public class StringReverse {

    public static String reverseString(String str) {
        String result = "";
        char ch;

        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            result = ch + result;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or string to reverse: ");
        String str = sc.nextLine();

        String result = reverseString(str);

        System.out.println("Reversed String/word is: " + result);

        sc.close();
    }
}
