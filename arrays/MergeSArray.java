package arrays;

public class MergeSArray {
    public static void main(String[] args) {
        int[] nums1={4,6,7,8,8,9,0,0,0,0,0,0,0};
         int m=6;
         int[] nums2={2,5,5,6,8,8,9};
         int n=7;
        int[] ar = new int[m];
        for (int i = 0; i < m; i++)
            ar[i] = nums1[i];

        int k = n + m;
        int a = 0, b = 0;
        for (int i = 0; i < k; i++) {

            if (a == m) {
                while (i < k) {
                    nums1[i++] = nums2[b];
                    b++;
                }
            }

            else if (b == n) {
                while (i < k) {
                    nums1[i++] = ar[a++];
                }
            }

            else {
                nums1[i] = (ar[a] < nums2[b]) ? ar[a++] : nums2[b++];
            }

        }
        for(int i=0;i<m+n;i++)
        System.out.println(nums1[i]);
    }
}
