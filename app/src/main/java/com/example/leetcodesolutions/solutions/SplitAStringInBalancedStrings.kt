package com.example.leetcodesolutions.solutions

/*
[1221. Split a String in Balanced Strings]
    https://leetcode.com/problems/split-a-string-in-balanced-strings/
*/
fun balancedStringSplit(s: String): Int {
    var result = 0

    s.fold(0) { acc, ch ->
        if (acc == 0) result++
        if (ch == 'L') acc + 1 else acc - 1
    }

    return result
}

//If "s" != balanced string, then use code below
/*
fun balancedStringSplit(s: String): Int {
    var result = 0

    s.fold(0) { acc, ch ->
        val balance = if (ch == 'L') acc + 1 else acc - 1

        if (balance == 0) result++

        balance
    }

    return result
}*/