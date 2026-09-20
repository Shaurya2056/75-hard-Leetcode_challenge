1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] result = new int[nums.length];
4        Arrays.fill(result,1);
5        int pre = 1;
6        int post = 1;
7        for(int i = 0; i<nums.length; i++){
8            result[i]=pre;
9            pre=nums[i]*pre;
10        }
11        for(int i = nums.length-1; i>=0; i--){
12           result[i]=result[i]*post;
13           post=post*nums[i];            
14        }
15        return result;
16    }
17}