package arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums={0,5,3,6,0,9,9,0};
        int n = nums.length;
        int i = 0;
        int pos = 0;
        for (i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // System.out.println("in else i="+i+" pos="+pos);
                nums[pos] = nums[i];
                pos++;

            }

        }
        while (pos < n) {
            nums[pos] = 0;
            pos++;
        }
            for(i=0;i<n;i++)
            System.out.println(nums[i]);
    }
}
