package com.yashwanth.DataStructuresAndAlgorithms.Greedy.MaximumSubarray;

class Solution {
    //kadanes algorithm
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int curSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(curSum<0&&curSum<nums[i]){
                curSum=nums[i];
                max=Math.max(max,curSum);
                continue;
            }
            curSum+=nums[i];
            max=Math.max(max,curSum);
        }
        return max;
    }
}
