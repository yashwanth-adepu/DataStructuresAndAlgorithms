package com.yashwanth.DataStructuresAndAlgorithms.Intervals.NonOverlappingIntervals;

import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int temp[]=null;
        int count=0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);//sorting using comparator lambda
        for(int i=0;i<intervals.length;i++){
            if(temp==null){
                temp=intervals[i];
            }
            else if(temp[1]>intervals[i][0]||temp[0]==intervals[i][0]){
                count++;
                if(temp[1]>intervals[i][1]){
                    temp[0]=intervals[i][0];
                    temp[1]=intervals[i][1];
                }
            }else{
                temp=intervals[i];
            }
        }
        return count;
    }
}