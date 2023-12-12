public class MinTread extends Thread{
    public int [] array;

    public MinTread(int[] array) {
        this.array = array;
    }

    public void run() {
        int min = array [0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min value = " + min);
    }
}
