package com.yashwanth.DataStructuresAndAlgorithms.BitManipulation.SumOfTwoIntegers;

class Solution {
    public int getSum(int a, int b) {
        //consider b as the carry
        //this algorithm will handle negative integer sum aswell
        while(b!=0){
            int temp;
            temp=a^b;
            b=(a&b)<<1;
            a=temp;
        }
        return a;
    }
}
