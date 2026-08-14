1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        int ans[]=new int[nums.length];
4       int count = 0;
5       for(int i=0;i<nums.length;i++){
6        count = 0;
7        for(int j =0;j<nums.length;j++){
8            if(j!=i && nums[j] < nums[i] ){
9                count++;
10            }
11        }
12           ans[i]=count;
13       } 
14       return ans;
15    }
16}
17