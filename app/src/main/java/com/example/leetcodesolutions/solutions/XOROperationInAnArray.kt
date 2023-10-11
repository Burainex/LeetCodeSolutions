package com.example.leetcodesolutions.solutions

/*
[1486. XOR Operation in an Array]
    https://leetcode.com/problems/xor-operation-in-an-array/
*/
fun xorOperation(n: Int, start: Int): Int {
    var result = 0

    repeat(n) {
        result = result xor (start + 2 * it)
    }

    return result
}