package arrays;

public class JumpGame1 {

    public static void main(String[] args) {
        int result = 0;
        int[] nums = { 3, 2, 1, 0, 4 };
        int n = nums.length;

        int[] v = new int[n];
        int[][] s = new int[2][n];

        for (int i = 0; i < n; i++)
            v[i] = 0;

        int top = 0;

        v[0] = 1;

        s[0][top] = nums[0];
        s[1][top] = 0;

        while (top >= 0) {
            int ele = s[0][top];
            int index = s[1][top];
            v[index] = 1;
            top--;
            // System.out.println("ele="+ele+",index="+index);

            for (int j = 0; j <= ele; j++) {
                // System.out.println("n-1 = "+(n-1)+", index+j = "+(index+j));
                if (index + j >= n - 1) {
                    result = 1;
                    break;
                }

                if (v[index + j] == 0) {
                    ++top;
                    s[0][top] = nums[index + j];
                    s[1][top] = index + j;
                }
            }
        }
        if (result == 0)
            System.out.println("false");
        else
            System.out.println("true");

    }
}
