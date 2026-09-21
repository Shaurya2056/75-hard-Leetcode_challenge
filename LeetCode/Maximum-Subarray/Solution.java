1class Solution {
2    public int maxSubArray(int[] nums) {
3        int curSum=0;
4        int maxSum=nums[0];
5        for(int i = 0; i<nums.length; i++){
6            if(curSum<0){
7                curSum=0;
8            }
9            curSum=curSum+nums[i];
10            maxSum=Math.max(curSum,maxSum);
11        }
12        return maxSum;
13    }
14}