package algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main (String[] args) {
        int[] data = {8, 5, 10, 2, 11, 3, 19, 1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(data);
        System.out.println(Arrays.toString(data));

    }

    public static void sort (int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) { // the condition would be < data.length - 1 - i because we know that the largest num bubbles to end
                if (data[j] > data[j + 1]) {
                    int temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}

/*
The time complexity for bubble sort is quadratic.
 */
