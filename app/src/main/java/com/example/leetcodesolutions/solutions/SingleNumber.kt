package com.example.leetcodesolutions.solutions

/*
[136. Single Number]
    https://leetcode.com/problems/single-number/
*/
fun singleNumber(nums: IntArray): Int {
    var result = nums[0]

    for (i in 1 until nums.size) {
        result = result xor nums[i]
    }

    return result
}