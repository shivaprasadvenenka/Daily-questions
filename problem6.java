/*
You are given an integer array nums of length n.

An array is trionic if there exist indices 0 < p < q < n − 1 such that:

nums[0...p] is strictly increasing,
nums[p...q] is strictly decreasing,
nums[q...n − 1] is strictly increasing.
Return true if nums is trionic, otherwise return false.

*/

//code
class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int i=0;
        for(i=1;i<n;i++)
        {
            if(nums[i-1]>=nums[i]) break;
            cnt=1;
        }
        for( i=i;i<n;i++)
        {
            if(nums[i-1]<=nums[i]) break;
            
            if(cnt==1)    cnt=2;
        }
        for( i=i;i<n;i++)
        {
            if(nums[i-1]>=nums[i]) break;
            if (cnt==2) cnt=3;
        }
        if( i==n &&cnt==3) return true;
        return false;

    }
}


/*
Input: nums = [1,3,5,4,2,6]

Output: true




Input: nums = [2,1,3]

Output: false


  */
