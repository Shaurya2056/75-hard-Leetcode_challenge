1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left = 0;
4        int right = numbers.length-1;
5    while(left<right){
6        if(numbers[right]+numbers[left]>target){
7            right=right-1;
8        }
9        else if(numbers[right]+numbers[left]<target){
10            left=left+1;
11        }
12        else{
13            return new int[]{left+1,right+1};
14        }
15    }
16    return null;
17    }
18}