package com.example.leetcodesolutions.solutions

/*
[1313. Decompress Run-Length Encoded List]
    https://leetcode.com/problems/decompress-run-length-encoded-list/
*/
fun decompressRLElist(nums: IntArray): IntArray {
    val decompressedList = mutableListOf<Int>()

    for (i in nums.indices step 2) {
        decompress(decompressedList, nums[i], nums[i + 1])
    }

    return decompressedList.toIntArray()
}

fun decompress(decompressedList: MutableList<Int>, freq: Int, value: Int) =
    repeat(freq) {
        decompressedList.add(value)
    }

