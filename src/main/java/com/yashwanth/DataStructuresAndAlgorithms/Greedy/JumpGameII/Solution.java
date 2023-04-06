package com.yashwanth.DataStructuresAndAlgorithms.Greedy.JumpGameII;

class Solution {
    //greedy solution with O(n) time
    public int jump(int[] nums) {
        int minStep=0;
        int l=0,r=0;
        while(r<nums.length-1){
            int farthest=0;
            for(int i=l;i<=r;i++){
                farthest=Math.max(farthest,i+nums[i]);
            }
            l=r+1;
            r=farthest;
            minStep++;
        }
        return minStep;

    }
}
