1class Solution {
2    public int maxProfit(int[] prices) {
3          int min = prices[0];
4        int profit = 0;
5
6        for (int i = 1; i < prices.length; i++){
7
8            if (prices[i] < min) {
9                min=prices[i];
10                
11            }
12
13            int currentProfit = prices[i] - min;
14
15            if (currentProfit > profit) {
16                profit = currentProfit;
17            }
18        }
19
20        return profit; 
21    }
22}