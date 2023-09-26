package com.example.leetcodesolutions.solutions

/*
[389. Find the Difference]
    https://leetcode.com/problems/find-the-difference/
*/
fun findTheDifference(s: String, t: String): Char {
    var result = 0

    for (ch in s) {
        result = result xor ch.code
    }
    for (ch in t) {
        result = result xor ch.code
    }

    return result.toChar()
}