package com.example.leetcodesolutions.solutions

/*
[1816. Truncate Sentence]
    https://leetcode.com/problems/truncate-sentence/
*/
fun truncateSentence(s: String, k: Int): String {

    val result = StringBuilder()
    var counter = 0

    for (ch in s) {
        if (ch == ' ') counter++
        if (counter == k) break
        result.append(ch)
    }

    return result.toString()
}