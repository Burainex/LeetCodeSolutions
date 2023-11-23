package com.example.leetcodesolutions.solutions

/*
[1672. Richest Customer Wealth]
    https://leetcode.com/problems/richest-customer-wealth/
*/
fun maximumWealth(accounts: Array<IntArray>): Int = accounts.maxOfOrNull { it.sum() } ?: 0