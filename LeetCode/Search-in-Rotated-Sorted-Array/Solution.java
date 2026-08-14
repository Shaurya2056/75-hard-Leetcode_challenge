1class Solution {
2    public int search(int[] nums, int target) {
3        
4        int left = 0;
5        int right = nums.length - 1;
6
7       
8            while (left <= right) {
9
10            int mid = (left + right) / 2;
11
12            if (nums[mid] == target) {
13                return mid;
14            }
15
16            
17            if (nums[left] <= nums[mid]) {
18
19           if (target >= nums[left] && target < nums[mid]) {
20                    right = mid - 1;
21                } else {
22                    left = mid + 1;
23                }
24
25            }
26            else {
27
28                if (target > nums[mid] && target <= nums[right]) {
29                    left = mid + 1;
30                } else {
31                    right = mid - 1;
32                }
33            }
34        }
35
36        return -1;
37    }
38}