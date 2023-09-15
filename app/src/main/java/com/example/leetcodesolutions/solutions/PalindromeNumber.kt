package com.example.leetcodesolutions.solutions

/*
[9. Palindrome Number]
    https://leetcode.com/problems/palindrome-number/
*/
fun isPalindrome(x: Int): Boolean {

    if (x < 0) return false

    var num = x
    var targetNum = 0
    val i = 10

    while (num != 0) {
        targetNum = targetNum * i + num % i
        num /= i
    }

    return (x == targetNum)
}