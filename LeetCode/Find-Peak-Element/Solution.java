1class Solution {
2    public int findPeakElement(int[] nums) {
3     int left = 0;
4     int right = nums.length-1;     
5    while(left<right){
6        int mid =left + (right-left)/2;
7        if(nums[mid]<nums[mid+1]){
8            left=mid+1;
9        }
10        else{
11            right=mid;
12        }
13    }
14    return left;
15     }
16}