public class MaxTread extends Thread{

    public int [] array;

    public MaxTread(int[] array) {
        this.array = array;
    }

    public void run() {
        int max = array [0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max value = " + max);
    }
}
