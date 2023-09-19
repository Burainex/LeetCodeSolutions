package com.example.leetcodesolutions.solutions

/*
[58. Length of Last Word]
    https://leetcode.com/problems/length-of-last-word/
*/
fun lengthOfLastWord(s: String): Int {
    if (s.length == 1) return s.length

    var start = s.length - 1

    while (s[start] == ' ') {
        start--
    }

    for (i in start downTo 0) {
        if (s[i] == ' ') return start - i
    }

    return ++start
}