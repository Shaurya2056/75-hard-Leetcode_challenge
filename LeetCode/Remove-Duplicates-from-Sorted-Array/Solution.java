1class Solution {
2    public int removeDuplicates(int[] nums) {
3            int i = 1;
4
5        for (int j = 1;j < nums.length; j++) {
6
7            if (nums[j] != nums[i - 1]) {
8                nums[i] = nums[j];
9                i++;
10            }
11        }
12
13        return i; 
14    }
15}