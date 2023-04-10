package com.yashwanth.DataStructuresAndAlgorithms.BitManipulation.ReverseBits;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result=0;
        int i=0;
        while(i>=0&&i<=31){
            int bit = (n>>i)&1;
            result=result|(bit<<(31-i));
            i++;
        }
        return result;
    }
}
