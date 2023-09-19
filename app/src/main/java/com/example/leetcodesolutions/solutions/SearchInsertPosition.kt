package com.example.leetcodesolutions.solutions

/*
[35. Search Insert Position]
    https://leetcode.com/problems/search-insert-position/
*/
fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val mid = (left + right) / 2

        when {
            target < nums[mid] -> right = mid - 1
            target > nums[mid] -> left = mid + 1
            target == nums[mid] -> return mid
        }
    }

    return left
}