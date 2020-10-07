package Ex_1;

import java.util.Arrays;

public class sort {
    /*
     *   Sorts given array with inserts and prints a string representation of the contents of the given array
     *
     *   Parameters: arr - array to sort (int[])
     *
     *   Return: void
     */
    public void SortTheArrayWithInserts(int[] arr) {
        for (int left = 0; left < arr.length; left++) {
            int value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }
        System.out.println(Arrays.toString(arr));
    }
}
