package com.example.leetcodesolutions.solutions

/*
[1431. Kids With the Greatest Number of Candies]
    https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
*/
fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val max = candies.max()
    val result = mutableListOf<Boolean>()

    for (i in candies) {
        result.add(i + extraCandies >= max)
    }

    return result
}