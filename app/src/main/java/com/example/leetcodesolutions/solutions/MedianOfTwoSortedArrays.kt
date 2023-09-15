package com.example.leetcodesolutions.solutions

/*
[4. Median of Two Sorted Arrays]
    https://leetcode.com/problems/median-of-two-sorted-arrays/
*/
fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    if (nums2.size < nums1.size) return findMedianSortedArrays(nums2, nums1)

    val x = nums1.size
    val y = nums2.size
    var left = 0
    var right = x

    while (left <= right) {
        val partitionX = (left + right) / 2
        val partitionY = (x + y + 1) / 2 - partitionX

        val maxLeftX = if (partitionX == 0) Int.MIN_VALUE else nums1[partitionX - 1]
        val minRightX = if (partitionX == x) Int.MAX_VALUE else nums1[partitionX]
        val maxLeftY = if (partitionY == 0) Int.MIN_VALUE else nums2[partitionY - 1]
        val minRightY = if (partitionY == y) Int.MAX_VALUE else nums2[partitionY]

        when {
            maxLeftX <= minRightY && maxLeftY <= minRightX -> {
                return if ((x + y) % 2 == 0) {
                    (maxLeftX.coerceAtLeast(maxLeftY) + minRightX.coerceAtMost(minRightY)) / 2.0
                } else {
                    (maxLeftX.coerceAtLeast(maxLeftY)).toDouble()
                }
            }

            maxLeftX > minRightY -> {
                right = partitionX - 1
            }

            else -> {
                left = partitionX + 1
            }
        }
    }

    throw Exception("Something went wrong")
}