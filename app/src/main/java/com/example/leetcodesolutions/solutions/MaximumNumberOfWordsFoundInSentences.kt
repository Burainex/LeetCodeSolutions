package com.example.leetcodesolutions.solutions

/*
[2114. Maximum Number of Words Found in Sentences]
    https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
*/
fun mostWordsFound(sentences: Array<String>): Int {
    var maxCount = 0

    for (sentence in sentences) {
        var tmpCount = 1

        for (ch in sentence) {
            if (ch == ' ') tmpCount++
        }

        maxCount = if (tmpCount > maxCount) tmpCount else maxCount
    }

    return maxCount
}