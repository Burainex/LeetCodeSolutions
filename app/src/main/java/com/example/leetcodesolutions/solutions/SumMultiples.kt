package com.example.leetcodesolutions.solutions

/*
[2652. Sum Multiples]
    https://leetcode.com/problems/sum-multiples/
*/
fun sumOfMultiples(n: Int): Int = (1..n).fold(0) { acc, i ->
    if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) acc + i
    else acc
}