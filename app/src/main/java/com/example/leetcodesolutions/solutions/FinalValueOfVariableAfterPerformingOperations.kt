package com.example.leetcodesolutions.solutions

/*
[2011. Final Value of Variable After Performing Operations]
    https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
*/
fun finalValueAfterOperations(operations: Array<String>): Int {
    var value = 0

    for (op in operations) {
        if (op[1] == '+') value++
        else value--
    }

    return value
}