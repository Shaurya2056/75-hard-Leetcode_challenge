1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set<Integer> visited = new HashSet<>();
4        for(int i = 0; i<nums.length; i++){
5            if(visited.contains(nums[i])){
6                return true;
7            }
8            else{
9                visited.add(nums[i]);
10            }
11        }
12        return false;
13    }
14}