1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int[] twoSum(int[] nums, int target) {
6     Map<Integer, Integer> map = new HashMap<>();
7     for(int i = 0; i<nums.length; i++){
8        int diff = target-nums[i];
9        if(map.containsKey(diff)){
10            return new int[]{map.get(diff), i};
11        }
12        map.put(nums[i], i);
13     }
14       return null;   
15    }
16}