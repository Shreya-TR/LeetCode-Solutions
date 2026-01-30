// LeetCode #121: Best Time to Buy and Sell Stock
// Difficulty: Easy
// Approach: Track min price and max profit in one pass
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // track lowest price so far
        int maxProfit = 0;                // track maximum profit
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // update min price
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice; // update max profit
            }
        }
        
        return maxProfit;
    }
}