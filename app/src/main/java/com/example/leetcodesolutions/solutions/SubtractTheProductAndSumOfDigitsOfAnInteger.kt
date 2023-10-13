package com.example.leetcodesolutions.solutions

/*
[1281. Subtract the Product and Sum of Digits of an Integer]
    https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
*/
fun subtractProductAndSum(n: Int): Int {
    var num = n
    var multiply = 1
    var sum = 0

    while (num != 0) {
        multiply *= num % 10
        sum += num % 10
        num /= 10
    }

    return multiply - sum
}