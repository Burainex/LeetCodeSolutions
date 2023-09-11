package com.example.leetcodesolutions.solutions


/*
[1. Two Sum]
    https://leetcode.com/problems/two-sum/description/
*/
object TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for ((index, value) in nums.withIndex()) {
            val targetElement = target - value
            if (map.containsKey(targetElement)) return intArrayOf(index, map[targetElement]!!)
            map[value] = index
        }

        throw Exception("Error")
    }
}