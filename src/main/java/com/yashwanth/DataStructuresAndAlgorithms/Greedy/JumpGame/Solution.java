package com.yashwanth.DataStructuresAndAlgorithms.Greedy.JumpGame;

/*class Solution {
    //recursion with visited
    boolean[] visited;
    public boolean canJump(int[] nums) {
        int len = nums.length;
        visited = new boolean[len];
        return canJump(0,len, nums, visited);
    }
    private boolean canJump(int ind, int len, int[] nums, boolean[] visited){
        if(ind>=len-1){
            return true;
        }
        if(visited[ind]){
            return false;
        }
        visited[ind]=true;
        int maxJumps = nums[ind];
        if(maxJumps==0){
            return false;
        }
        for(int i=maxJumps;i>=1;i--){
            if(canJump(ind+i, len, nums, visited)){
                return true;
            }
        }
        return false;
    }
}*/
class Solution {
    //dp solution with recursion time comp-O(n)
    /*public int jump(int[] nums,int pos,int dp[]){
        if(pos>=nums.length-1){
            return 1;
        }
        if(dp[pos]!=-1){
            return dp[pos];
        }
        for(int i=1;i<=nums[pos];i++){
            if(jump(nums,pos+i,dp)==1){
                return dp[pos]=1;
            }
        }
        return dp[pos]=0;
    }
    public boolean canJump(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        return jump(nums,0,dp)==1?true:false;
    }*/
    //greedy solution with O(n) target shift from end to beginning
    public boolean canJump(int[] nums) {
        int target=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(target<=i+nums[i]){
                target=i;
            }
        }
        if(target==0){
            return true;
        }
        return false;
    }
}