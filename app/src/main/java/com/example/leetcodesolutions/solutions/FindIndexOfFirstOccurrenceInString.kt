package com.example.leetcodesolutions.solutions

/*
[28. Find the Index of the First Occurrence in a String]
    https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
*/
fun strStr(haystack: String, needle: String): Int {
    if (haystack.length < needle.length) return -1
    var needleIndex = 0
    var haystackIndex = 0

    while (haystackIndex < haystack.length) {
        if (haystack[haystackIndex] == needle[needleIndex]) {
            if (needleIndex == needle.length - 1) return haystackIndex - needleIndex
            needleIndex++
        } else {
            haystackIndex -= needleIndex
            needleIndex = 0
        }

        haystackIndex++
    }
    return -1
}