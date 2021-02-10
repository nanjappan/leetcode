// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Easy
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        int bestProfit = 0;
        
        for (int i : prices)
        {
            if(i < minPrice)
            {
                minPrice = i;
                maxPrice = 0;
                continue;
            }
            
            if (maxPrice < i)
            {
                maxPrice = i;
                if (bestProfit < (maxPrice - minPrice))
                    bestProfit = maxPrice - minPrice;
            }
        }
        
        return bestProfit;
    }
}
