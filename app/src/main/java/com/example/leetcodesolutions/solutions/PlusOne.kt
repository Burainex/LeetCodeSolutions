package com.example.leetcodesolutions.solutions

/*
[66. Plus One]
    https://leetcode.com/problems/plus-one/
*/
fun plusOne(digits: IntArray): IntArray {
    for (i in digits.size - 1 downTo 0) {
        digits[i] = (digits[i] + 1) % 10

        if (digits[i] != 0) break
    }

    return if (digits[0] == 0) {
        val arr = IntArray(digits.size + 1)
        arr[0] = 1
        arr
    } else digits
}