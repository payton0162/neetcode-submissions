class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = 0
        sell = 1  # (Also make sure to change this from len(prices) + 1!)
        max_profit = 0

        while sell < len(prices):
            if prices[buy] < prices[sell]:
                profit = prices[sell] - prices[buy]
                max_profit = max(max_profit, profit)
            else: 
                buy = sell
            sell += 1
        
        # This needs 8 spaces of indentation to stay inside the function!
        return max_profit

            





