package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15};

        System.out.println("Missing number from given sorted array is: " + findMissingNumber(array));
    }

    static int findMissingNumber(int[] array) {
        int missing = 0;
        int sum = 0;
        
        for(int i: array) {
            sum += i;
        }

        int lastElement = array[array.length-1];
        int originalSum = (lastElement * (lastElement+1)) / 2;
        missing = originalSum - sum;

        return missing;
    }
}
