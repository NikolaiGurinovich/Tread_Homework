import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        MaxTread max = new MaxTread(array);
        MinTread min = new MinTread(array);
        InsertionSortThread insertionSortThread = new InsertionSortThread(array);
        SelectionSortThread selectionSortThread = new SelectionSortThread(array);
        BubbleSortThread bubbleSortThread = new BubbleSortThread(array);
        max.start();
        min.start();
        insertionSortThread.start();
        selectionSortThread.start();
        bubbleSortThread.start();
    }
}