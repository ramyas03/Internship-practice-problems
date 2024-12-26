package arrays;

public class RemDuplicateSArray {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 8, 8, 8, 9, 11 };
        int n = nums.length;
        int pos = 0;

        for (int ele = 1; ele < n; ele++) {
            if (nums[pos] != nums[ele]) {
                nums[++pos] = nums[ele];

            }
        }
        for (int i = 0; i <= pos; i++)
            System.out.println(nums[i]);

    }
}
