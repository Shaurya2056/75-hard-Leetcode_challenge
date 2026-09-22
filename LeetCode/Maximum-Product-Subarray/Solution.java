1class Solution {
2    public int maxProduct(int[] nums) {
3        if(nums.length==0){
4            return 0;
5        }
6        int min = nums[0];
7        int max = nums[0];
8        int result = max;
9
10        for(int i = 1; i<nums.length; i++){
11            int cur = nums[i];
12            int tempMax = Math.max(cur,Math.max(max*cur,min*cur));
13            min = Math.min(cur,Math.min(min*cur,max*cur));
14            max = tempMax;
15            result = Math.max(result,max);
16        }
17        return result;
18        
19
20    }
21}