1class Solution {
2    public int maxArea(int[] height) {
3        int i = 0; int j = height.length-1;
4        int max =0;
5        while(i<j){
6            int min = Math.min(height[i],height[j]);
7            int h = min*(j-i);
8            max = Math.max(max,h);
9            if(height[i]<height[j]){
10                i++;
11            }
12                else{
13                j--;
14                }
15            
16        }
17        return max;
18    }
19}