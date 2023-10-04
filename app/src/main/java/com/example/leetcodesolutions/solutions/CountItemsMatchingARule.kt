package com.example.leetcodesolutions.solutions

/*
[1773. Count Items Matching a Rule]
    https://leetcode.com/problems/count-items-matching-a-rule/
*/
fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
    val ruleIndex = when (ruleKey) {
        "type" -> 0
        "color" -> 1
        else -> 2
    }

    return items.count { it[ruleIndex] == ruleValue }
}