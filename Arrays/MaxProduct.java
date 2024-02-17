package Arrays;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int[] array = {23, 32, 34, 43, 32, 3, 92, 0};
        Arrays.sort(array);     // sorting the array to design an algo which will execute in nlogn time complexity

        System.out.println(findPair(array));

    }

    static String findPair(int[] array) {
        System.out.println(Arrays.toString(array) + "\n");
        int left = 0;
        int right = array.length-1;
        int product = 1;
        String pair = "";

        while(left < right) {
            if(array[left] * array[right] > product) {      // if product of elements is greator than current greatest product
                pair = array[left] + " , " + array[right];  // pair = both elements separated by coma
                product = array[left] * array[right];
                left++;     // increment left pointer by one
                right--;    // decrement right pointer by one
            } else if(array[left] * array[right] < product) {
                left++;
            } else {
                right--;
            }
        }
        return pair;
    }
}
