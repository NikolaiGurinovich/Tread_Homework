import java.util.Arrays;

public class BubbleSortThread extends Thread{
    public int [] array;

    public BubbleSortThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    needIteration = true;
                }
            }
        }
        System.out.println("BubbleSort: " + Arrays.toString(array));
    }

    private void swap(int[] array, int i1, int i2) {
        int tmp = array[i1];
        array[i1] = array[i2];
        array[i2] = tmp;
    }
}
