1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length-1;
5        while(left<=right){
6            int mid = (left+right)/2;
7            if(nums[mid]==target){
8                return mid;
9            }
10            if(nums[left]<=nums[mid]){
11                if(target<nums[left] || target>nums[mid]){
12                    left = mid + 1;
13                }
14                else{
15                    right = mid-1;
16                }
17            }
18            else{
19                if(target>nums[right] || target<nums[mid]){
20                    right=mid-1;
21                }
22                else{
23                    left=mid+1;
24                }
25            }
26        }
27        return -1;
28    }
29}