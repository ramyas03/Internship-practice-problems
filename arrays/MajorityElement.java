package arrays;

import java.util.Arrays;

public class MajorityElement {
     public static void main (String[] args)
    {
        int[] nums={ 2, 2, 1, 1, 1, 2, 2};
        int flag=0;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n/2;i++)
        {
          
            if (nums[i]==nums[n/2])
                {System.out.println(nums[i]);
                  flag=1;  
                break;}
        }
        if(flag==0)
        System.out.println(nums[n-1]);
    }
}
