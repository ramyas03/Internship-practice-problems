package arrays;

import java.util.Scanner;

public class DifficultyRatingOrder {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] d = new int[n];

            for (int i = 0; i < n; i++) {
                d[i] = sc.nextInt();
            }
            int flag = 1;
            for (int i = 0; i < n - 1; i++) {
                if (d[i] > d[i + 1]) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("No");
            } else
                System.out.println("Yes");
        }
    }
}
