package com.example.leetcodesolutions.solutions

/*
[2824. Count Pairs Whose Sum is Less than Target]
    https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
*/
fun countPairs(nums: List<Int>, target: Int): Int {
    var count = 0

    for (i in 0 until nums.size - 1)
        for (j in i + 1 until nums.size)
            if (nums[i] + nums[j] < target) count++

    return count
}