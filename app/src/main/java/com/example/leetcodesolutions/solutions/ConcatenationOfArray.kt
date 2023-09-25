package com.example.leetcodesolutions.solutions

/*
[1929. Concatenation of Array]
    https://leetcode.com/problems/concatenation-of-array/
*/

fun getConcatenation(nums: IntArray): IntArray {
    val resultArr = IntArray(nums.size * 2)

    System.arraycopy(nums, 0, resultArr, 0, nums.size)
    System.arraycopy(nums, 0, resultArr, nums.size, nums.size)

    return resultArr
}