package arrays;

public class SegregateOddEven {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 3, 7, 0, 45, 23, 12, 56, 89, 2 };

        int n = arr.length;
        int pos = 0, i = 0;

        while (i < n) {

            if (i < n - 1 && arr[pos] % 2 == 0) {
                System.out.println("even =" + arr[pos]);
                pos++;
                i++;
            } else {
                while (i < n - 1 && arr[i] % 2 != 0) {
                    System.out.println("odd =" + arr[i]);
                    i++;
                }
                System.out.println("swap" + arr[i] + arr[pos]);
                int t = arr[i];
                arr[i] = arr[pos];
                arr[pos] = t;
                pos++;
                i++;
            }

        }

        System.out.println("Array after segregation: ");
        for (i = 0; i < n; i++)
            System.out.println(arr[i]);

    }
}
