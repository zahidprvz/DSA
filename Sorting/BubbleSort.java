import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12, 0, 9, -1, 43};

        for(int i=0; i<array.length-1; i++) {
            for(int j=0; j<array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.printf("Sorted Array after Bubble Sort is: %s%n" , Arrays.toString(array));
    }
}