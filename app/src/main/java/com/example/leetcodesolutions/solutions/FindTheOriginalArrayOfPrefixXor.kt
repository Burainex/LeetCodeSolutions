package com.example.leetcodesolutions.solutions

/*
[2433. Find The Original Array of Prefix Xor]
    https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/
*/
fun findArray(pref: IntArray): IntArray {
    val arr = IntArray(pref.size)
    arr[0] = pref[0]

    for (i in 1 until arr.size) {
        arr[i] = pref[i - 1] xor pref[i]
    }

    return arr
}