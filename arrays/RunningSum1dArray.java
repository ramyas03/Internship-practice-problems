package arrays;

public class RunningSum1dArray {
    public static void main(String[] args) {

        int[] nums = { 0, 5, 3, 2, 0, 9, 1, 0 };

        int n = nums.length;
        int[] runningSum = new int[n];

        runningSum[0] = nums[0];
        
        for (int i = 1; i < n; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];

        }

        for (int i = 0; i < n; i++)
            System.out.println(runningSum[i]);

    }
}
