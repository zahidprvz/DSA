package Arrays;

public class PermutationCheck {
    public static void main(String[] args) {
        int[] array1 = { 2, 3, 5, 4, 6 };
        int[] array2 = { 3, 2, 6, 7, 4 };

        if (findPermutation(array1, array2)) {
            System.out.println("Arrays are permutation of each other!");
        } else {
            System.out.println("Arrays are not permutation of each other!");
        }
    }

    static boolean findPermutation(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;

        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 *= array1[i];
            mul2 *= array2[i];
        }
        if (sum1 == sum2 && mul1 == mul2) {
            return true;
        }
        return false;
    }
}
