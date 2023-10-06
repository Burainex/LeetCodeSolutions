package com.example.leetcodesolutions.solutions

/*
[709. To Lower Case]
    https://leetcode.com/problems/to-lower-case/
*/
fun toLowerCase(s: String): String = StringBuilder(s.length).apply {
    s.forEach { ch ->
        if (ch in 'A'..'Z') append(ch + 32) else append(ch)
    }
}.toString()