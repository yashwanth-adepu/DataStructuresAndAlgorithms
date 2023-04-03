package com.yashwanth.DataStructuresAndAlgorithms.Greedy.HandOfStraights;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0){
            return false;
        }
        Map<Integer,Integer> map =  new HashMap<>();
        int count=0;
        for(int num:hand){
            count = map.getOrDefault(num,0);
            map.put(num,count+1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue(map.keySet());
        while(!minHeap.isEmpty()){
            int min =minHeap.peek();
            for(int i=min;i<min+groupSize;i++){
                int freq = map.getOrDefault(i,0);
                if(freq==0){
                    return false;
                }
                freq--;
                if(freq==0){
                    if(minHeap.peek()!=i){
                        return false;
                    }
                    minHeap.remove();
                    map.remove(i);
                }else{
                    map.put(i,freq);
                }
            }
        }
        return true;
    }
}
