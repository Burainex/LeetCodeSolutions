package com.example.leetcodesolutions.solutions

/*
[771. Jewels and Stones]
    https://leetcode.com/problems/jewels-and-stones/
*/
fun numJewelsInStones(jewels: String, stones: String): Int {
    val jewelsCatalog = jewels.toSet()
    var jewelsQuantity = 0

    for (stone in stones) {
        if (jewelsCatalog.contains(stone)) jewelsQuantity++
    }

    return jewelsQuantity
}