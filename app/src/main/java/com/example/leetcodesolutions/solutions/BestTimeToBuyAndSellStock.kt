package com.example.leetcodesolutions.solutions

/*
[121. Best Time to Buy and Sell Stock]
    https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/
fun maxProfit(prices: IntArray): Int {
    if (prices.size <= 1) return 0

    var min = Int.MAX_VALUE
    var maxProfit = 0

    for (curr in prices) {
        when {
            curr < min -> min = curr
            curr - min > maxProfit -> maxProfit = curr - min
        }
    }
    return maxProfit
}