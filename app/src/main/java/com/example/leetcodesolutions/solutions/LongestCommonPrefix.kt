package com.example.leetcodesolutions.solutions

/*
[14. Longest Common Prefix]
    https://leetcode.com/problems/longest-common-prefix/
*/
fun longestCommonPrefix(strs: Array<String>): String {
    var strMinLength = 200
    val prefix = StringBuilder()
    var i = 1

    if (strs.size == 1) return strs[0]
    if (strs[0].isNotEmpty()) prefix.append(strs[0][0])

    for (s in strs) {
        if (s.isEmpty() || s[0] != prefix[0]) return ""
        strMinLength = strMinLength.coerceAtMost(s.length)
    }

    while (i < strMinLength) {
        val ch = strs[0][i]
        for (s in strs) {
            if (s[i] != ch) return prefix.toString()
        }
        prefix.append(ch)
        i++
    }

    return prefix.toString()
}