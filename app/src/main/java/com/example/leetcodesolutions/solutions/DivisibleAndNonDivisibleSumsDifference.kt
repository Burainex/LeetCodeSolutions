package com.example.leetcodesolutions.solutions

/*
[2894. Divisible and Non-divisible Sums Difference]
    https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/
*/
fun differenceOfSums(n: Int, m: Int): Int {
    var result = 0

    for (i in 1..n) {
        if (i % m != 0) result += i
        else result -= i
    }

    return result
}