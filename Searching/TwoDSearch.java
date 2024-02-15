import java.util.Scanner;

public class TwoDSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for array: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns for array: ");
        int col = sc.nextInt();

        int[][] array = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("\nEnter value for (%d,%d) element of array: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n");

        System.out.print("Enter the number to search in array: ");
        int key = sc.nextInt();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(array[i][j] == key) {
                    System.out.printf("The number is found at (%d, %d)\n", i, j);
                }
            }
        }

        sc.close();
    }
}
