package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = { 7, 2, 6, 3, 4, 5 };
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int t = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = t;
        }

        System.out.println("" + Arrays.toString(arr));
    }
}