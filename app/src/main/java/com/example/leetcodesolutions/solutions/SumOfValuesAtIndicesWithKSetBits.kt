package com.example.leetcodesolutions.solutions

/*
[2859. Sum of Values at Indices With K Set Bits]
    https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/description/
*/
fun sumIndicesWithKSetBits(nums: List<Int>, k: Int): Int {
    if (k == 0) return nums[k]

    var result = 0

    nums.forEachIndexed { index, value ->
        if (index.countOneBits() == k) result += value
    }

    return result
}