public class ArraySum {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 3};

        System.out.println(findSum(array, array.length));
    }

    public static int findSum(int[] array, int length) {
        if(length == 0) {
            return 0;
        }

        int sum = array[length-1] + findSum(array, length-1);
        return sum;
    }
}
