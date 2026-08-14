1class Solution {
2    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
3          int unplaced = 0;
4
5        for (int i = 0; i < fruits.length; i++) {
6
7            boolean placed = false;
8
9            for (int j = 0; j < baskets.length; j++) {
10
11                if (baskets[j] >= fruits[i]) {
12                    baskets[j] = -1;   
13                    placed = true;
14                    break;
15                }
16            }
17
18            if (!placed) {
19                unplaced++;
20            }
21        }
22
23        return unplaced;
24    }
25}