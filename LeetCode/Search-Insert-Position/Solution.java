1class Solution {
2    public int searchInsert(int[] nums, int target) {
3      int index=Arrays.binarySearch(nums, target);
4      return index>=0?index:-(index+1);  
5    }
6}