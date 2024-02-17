package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {2, 3, 12, 2, 4, 6, 0, 6, 3, 2, 5, 1};

        Arrays.sort(array); // Sort the array

        System.out.print("Current array is: " + Arrays.toString(array) + "\n\nEnter any number to find the sum pair for: ");
        int key = sc.nextInt();

        findPairs(array, key);

        sc.close();
    }

    static void findPairs(int[] array, int key) {
        int left = 0; // Pointer to the beginning of the array
        int right = array.length - 1; // Pointer to the end of the array

        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == key) {
                System.out.println("Pair: [" + array[left] + ", " + array[right] + "]");
                left++; // Move left pointer to find the next pair
                right--; // Move right pointer to find the next pair
            } else if (sum < key) {
                left++; // Increment left pointer if sum is less than key
            } else {
                right--; // Decrement right pointer if sum is greater than key
            }
        }
    }
}
