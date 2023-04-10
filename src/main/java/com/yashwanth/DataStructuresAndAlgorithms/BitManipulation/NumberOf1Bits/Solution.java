package com.yashwanth.DataStructuresAndAlgorithms.BitManipulation.NumberOf1Bits;

public class Solution {
    // you need to treat n as an unsigned value
   /* public int hammingWeight(int n) {
        int lastBit;
        int count=0;
        while(n!=0){
            lastBit=n&1;
            if(lastBit==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }*/
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }

}
