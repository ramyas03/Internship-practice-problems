package arrays;

public class Sort012 {


        // Function to sort the array of 0s, 1s and 2s
        static void sort012(int[] arr) {
            
        }

        public static void main(String[] args) {
            int[] arr = { 0, 1, 2, 0, 1, 2 };
            int n = arr.length;

            int c0 = 0, c1 = 0, c2 = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 0)
                    c0 += 1;
                else if (arr[i] == 1)
                    c1 += 1;
                else
                    c2 += 1;
            }

            int idx = 0;

            for (int i = 0; i < c0; i++)
                arr[idx++] = 0;

            for (int i = 0; i < c1; i++)
                arr[idx++] = 1;

            for (int i = 0; i < c2; i++)
                arr[idx++] = 2;

            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }
    }
