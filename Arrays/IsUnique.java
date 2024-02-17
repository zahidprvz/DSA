package Arrays;

import java.util.Arrays;

public class IsUnique {
    public static void main(String[] args) {
        int[] array = {20, 10, 30, 43, 20};

        if(isUnique(array)) {
            System.out.println("Array have unique elements!");
        } else {
            System.out.println("Array have repeating values!");
        }
    }

    static boolean isUnique(int[] array) {
        Arrays.sort(array);     // time complexity will be nlogn instead of n^2 if we sort the array first

        for(int i=0; i<array.length-1; i++) {   
            if(array[i] == array[i+1]) {        // as array is sorted so if there are unique values then there will be no repeating adjacent elements
                return false;
            } 
        }
        return true;
    }
}
 