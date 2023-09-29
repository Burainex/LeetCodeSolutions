package com.example.leetcodesolutions.solutions

/*
[1108. Defanging an IP Address]
    https://leetcode.com/problems/build-array-from-permutation/
*/
fun defangIPaddr(address: String): String {
    val result = StringBuilder()

    for (ch in address) {
        if (ch == '.') result.append("[${ch}]")
        else result.append(ch)
    }

    return result.toString()
}