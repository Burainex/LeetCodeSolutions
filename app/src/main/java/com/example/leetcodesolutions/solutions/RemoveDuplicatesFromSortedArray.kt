package com.example.leetcodesolutions.solutions

/*
[26. Remove Duplicates from Sorted Array]
    https://leetcode.com/problems/remove-duplicates-from-sorted-array/
*/
fun removeDuplicates(nums: IntArray): Int {
    var k = 0

    for (num in nums) {
        if (num != nums[k]) nums[++k] = num
    }

    return k + 1
}