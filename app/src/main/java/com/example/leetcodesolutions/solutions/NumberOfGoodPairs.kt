package com.example.leetcodesolutions.solutions

/*
[1512. Number of Good Pairs]
    https://leetcode.com/problems/number-of-good-pairs/
*/
fun numIdenticalPairs(nums: IntArray): Int = nums
    .groupBy { it }
    .map { it.value.size }
    .fold(0) { acc, count -> acc + count * (count - 1) / 2 }