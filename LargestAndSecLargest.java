
import java.util.Scanner;

public class LargestAndSecLargest {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int i = 1;
            while (a[0] == a[i]) {
                i++;
            }
            int l = (a[0] > a[i]) ? a[0] : a[i];
            int s = (a[0] < a[i]) ? a[0] : a[i];
            System.out.println(l + " , " + s);
            i++;
            for (; i < n; i++) {
                if (a[i] > l) {
                    s = l;
                    l = a[i];
                } else if (a[i] > s && a[i] != l) {
                    s = a[i];
                }
            }

            System.out.println(l + s);

        }
    }
}
