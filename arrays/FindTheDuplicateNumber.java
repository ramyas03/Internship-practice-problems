package arrays;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {

        int[] nums = { 2, 4, 3, 1, 1 };
        int i;
        for (i = 0; i < nums.length - 1; i = i + 2) {
            // System.out.println(i+" "+(i+1) );
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println(nums[i]);
                    break;
                } else if (nums[i + 1] == nums[j]) {
                    System.out.println(nums[i + 1]);
                    break;
                }
            }
        }

        if (i == nums.length - 1) {

            // System.out.println(i);
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println(nums[i]);
                    break;
                }

            }

        }

    }
}
