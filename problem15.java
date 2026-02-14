/*find the distinct difference array
  
  You are given a 0-indexed array nums of length n.
The distinct difference array of nums is an array diff of length n such that diff[i] is equal to the number of distinct elements in the suffix 
  nums[i + 1, ..., n - 1] subtracted from the number of distinct elements in the prefix nums[0, ..., i].

Return the distinct difference array of nums.

Note that nums[i, ..., j] denotes the subarray of nums starting at index i and ending at index j inclusive. Particularly, if i > j 
  then nums[i, ..., j] denotes an empty subarray.
  */


//code
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashMap<Integer,Integer> hl=new HashMap<>();
        HashMap<Integer,Integer> hr=new HashMap<>();
        int n=nums.length;
        int[] r=new int[n];
        for(int i=0;i<n;i++)
        {
            hr.put(nums[i],hr.getOrDefault(nums[i],0)+1);
        }
        for(ant i=0;i<n;i++)
        {
            hl.put(nums[i],hl.getOrDefault(nums[i],0)+1);
            if(hr.containsKey(nums[i]))
            {
                if(hr.get(nums[i])==1) hr.remove(nums[i]);
                else hr.put(nums[i],hr.get(nums[i])-1);
            }
            r[i]=hl.size()-hr.size();
        }
        return r;
    }
}

/*
Input: nums = [3,2,3,4,2]
Output: [-2,-1,0,2,3]
