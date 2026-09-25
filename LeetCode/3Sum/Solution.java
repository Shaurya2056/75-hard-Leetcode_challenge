1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>>result = new ArrayList<>();
5        for(int i = 0; i<nums.length && nums[i]<=0; i++){
6            if(i==0 || nums[i] != nums[i-1]){
7                twoSum2(nums,i,result);
8            }
9        }
10        return result;
11    }
12    void twoSum2(int[] nums, int i, List<List<Integer>>result){
13
14        int left = i+1;
15        int right = nums.length-1;
16        while(left<right){
17            int sum = nums[i]+nums[left]+nums[right];
18            if(sum<0){
19                left++;
20            }
21            else if(sum>0){
22                right--;
23            }
24            else{
25                result.add(Arrays.asList(nums[i],nums[left++],nums[right--]));
26                while(left<right && nums[left]==nums[left-1]){
27                    ++left;
28                }
29            }
30        }
31    }
32}