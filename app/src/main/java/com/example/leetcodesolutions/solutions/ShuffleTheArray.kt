package com.example.leetcodesolutions.solutions

/*
[1470. Shuffle the Array]
    https://leetcode.com/problems/shuffle-the-array/
*/
fun shuffle(nums: IntArray, n: Int): IntArray {
    val result = IntArray(nums.size)

    for (i in 0 until n)
        result[i * 2] = nums[i]

    for (i in n until nums.size)
        result[(i - n) * 2 + 1] = nums[i]

    return result
}