package com.example.leetcodesolutions.solutions

/*
[69. Sqrt(x)]
    https://leetcode.com/problems/sqrtx/description/
*/
fun mySqrt(x: Int): Int {
    var left = 1
    var right = x

    while (left <= right) {
        val mid = (left + right) / 2
        if (mid == x / mid) return mid

        if (mid > x / mid) right = mid - 1
        else left = mid + 1
    }

    return right
}