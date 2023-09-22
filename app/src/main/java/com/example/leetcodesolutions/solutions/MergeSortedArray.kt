package com.example.leetcodesolutions.solutions

/*
[88. Merge Sorted Array]
    https://leetcode.com/problems/merge-sorted-array/
*/
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var i = m + n - 1
    var x = m - 1
    var y = n - 1

    while (y >= 0) {
        nums1[i--] = if (x >= 0 && nums1[x] > nums2[y]) nums1[x--] else nums2[y--]
    }
}