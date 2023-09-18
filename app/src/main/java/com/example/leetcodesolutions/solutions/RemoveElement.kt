package com.example.leetcodesolutions.solutions

/*
[27. Remove Element]
    https://leetcode.com/problems/remove-element/
*/
fun removeElement(nums: IntArray, `val`: Int): Int {
    var k = 0

    for (num in nums) {
        if (num != `val`) nums[k++] = num
    }

    return k
}