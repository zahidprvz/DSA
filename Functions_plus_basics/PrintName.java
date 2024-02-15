import java.util.*;

public class PrintName {

    public static void printName(String name) {
        System.out.println("You entered: " + name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the name: ");
        String name = sc.next();

        printName(name);

        sc.close();
    }
}