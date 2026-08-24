1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3       int left=0;
4       double sum=0;
5       for(int i=0; i<k;i++)
6       sum+=nums[i];
7      double max = sum;
8       for(int i =k; i<nums.length;i++){
9        sum+=nums[i]-nums[left++];
10        max=Math.max(max,sum);
11       }
12       return (double)max/k;
13    }
14}