import java.util.Arrays;

public class SelectionSortThread extends Thread{
    public int [] array;

    public SelectionSortThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        System.out.println("SelectionSort: " + Arrays.toString(array));
    }
    private void swap(int[] array, int i1, int i2) {
        int tmp = array[i1];
        array[i1] = array[i2];
        array[i2] = tmp;
    }
}
