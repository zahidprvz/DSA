public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {4, 5, 2, 1, 10};

        for(int i=0; i<array.length-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<array.length; j++) {
                if(array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}