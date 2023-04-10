package com.yashwanth.DataStructuresAndAlgorithms.BitManipulation.MissingNumber;

class Solution {
    public int missingNumber(int[] nums) {
        //we can use xor with given input array and numbers from 0 to n left over element is the result
        // another approach is do sum of n(n+1)/2 and subtract from input array sum
        int result=0;
        for(int i=0;i<nums.length;i++){
            result=result^i^nums[i];
        }
        result=result^nums.length;
        return result;
    }
}
