package com.example.leetcodesolutions.solutions

/*
[1689. Partitioning Into Minimum Number Of Deci-Binary Numbers]
    https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
*/
fun minPartitions(n: String): Int {
    var max = 0

    for (ch in n) {
        if (ch - '0' > max) max = ch - '0'
    }

    return max
}