package com.yashwanth.DataStructuresAndAlgorithms.Intervals.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        int temp[]=null;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);//sorting using comparator lambda
        for(int i=0;i<intervals.length;i++){
            if(temp==null){
                temp=intervals[i];
            }
            else if(temp[1]>=intervals[i][0]){
                temp[0]=Math.min(temp[0],intervals[i][0]);
                temp[1]=Math.max(temp[1],intervals[i][1]);
            }else{
                result.add(temp);
                temp=intervals[i];
            }
        }
        result.add(temp);
        return result.toArray(new int[result.size()][]);
    }
}
