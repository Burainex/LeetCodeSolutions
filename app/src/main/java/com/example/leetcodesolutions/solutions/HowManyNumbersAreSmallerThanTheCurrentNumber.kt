package com.example.leetcodesolutions.solutions

/*
[1365. How Many Numbers Are Smaller Than the Current Number]
    https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
*/
fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val numsListSorted = nums.sorted()
    val numsMap = mutableMapOf<Int, Int>()

    for (i in numsListSorted.indices) {
        if (!numsMap.containsKey(numsListSorted[i]))
            numsMap[numsListSorted[i]] = i
    }

    return IntArray(nums.size) {
        numsMap[nums[it]]!!
    }
}