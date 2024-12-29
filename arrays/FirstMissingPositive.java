package arrays;

public class FirstMissingPositive {

    
        public static void main(String[] args) {

            int[] nums = {1,9,3,-1,7,3,2,7};
            int n = nums.length;
            int i = 0;
            int result = n + 1;
            while (i < n) {
                if (nums[i] > n || nums[i] < 1) {
                    nums[i] = 0;
                    i++;
                } else if (nums[i] == i + 1) {
                    i++;
                } else if (nums[i] == nums[nums[i] - 1]) {
                    nums[i] = 0;
                    i++;
                } else {
                    int temp = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = temp;
                }
            }

            // for(i=0;i<n;i++)
            // System.out.println(nums[i]);

            for (i = 0; i < n; i++) {
                // System.out.println(nums[i]);
                if (nums[i] == 0) {
                    result = i + 1;
                    break;
                }
            }

            System.out.println(result);
        }

    }


