1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4       List<Integer> list = new ArrayList<>();
5       for(int i : nums) 
6       {
7        set.add(i);
8       }
9       for(int i = 1; i<=nums.length; i++)
10       {
11        if(set.contains(i))
12        continue;
13        list.add(i);
14       }
15       return list;
16    }
17}