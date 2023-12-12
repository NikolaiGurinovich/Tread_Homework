import java.util.Arrays;

public class InsertionSortThread extends Thread{
    public int [] array;

    public InsertionSortThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println("InsertionSort: " + Arrays.toString(array));
    }
}
