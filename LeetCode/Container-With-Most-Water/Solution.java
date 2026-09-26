1class Solution {
2    public int maxArea(int[] height) {
3        int max = 0;
4        int left = 0;
5        int right = height.length-1;
6        while(left<right){
7            int width = right-left;
8            int area = Math.min(height[left],height[right])*width;
9            max = Math.max(max,area);
10            if(height[left]<=height[right]){
11                left++;
12            }
13            else{
14                right--;
15            }
16        }
17        return max;
18    }
19}
20       