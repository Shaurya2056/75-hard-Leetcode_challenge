1class Solution {
2    public void moveZeroes(int[] nums) {
3        int i =0; int j=0;
4        while(i<nums.length){
5            if(nums[i]!=0){
6                int temp = nums[i];
7                nums[i]=nums[j];
8                nums[j]=temp;
9                j++;
10            }
11            i++;
12        }                                                                                                
13    }
14}