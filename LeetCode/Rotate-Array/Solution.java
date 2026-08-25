1class Solution{
2    void helper(int[] nums, int s, int e){
3        while(s<=e){
4            int temp = nums[s];
5            nums[s] = nums[e];
6            nums[e] = temp;
7            s++;
8            e--;
9        }
10    }
11    public void rotate(int[] nums, int k){
12        k=k%nums.length;
13        k=nums.length-1-k;
14        helper(nums,0,k);
15       helper(nums,k+1,nums.length-1);
16      helper(nums,0,nums.length-1);
17    }
18}
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36