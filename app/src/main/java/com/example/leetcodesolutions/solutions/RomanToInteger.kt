package com.example.leetcodesolutions.solutions

/*
[13. Roman to Integer]
    https://leetcode.com/problems/roman-to-integer/
*/
fun romanToInt(s: String): Int {
    val romanToIntMap = hashMapOf<Char, Int>(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    var currIndex = 1
    var prevIndex = currIndex - 1
    var resultNumber = 0

    while (currIndex < s.length) {
        val prevValue = romanToIntMap[s[prevIndex]]
        val currValue = romanToIntMap[s[currIndex]]

        if (prevValue != null && currValue != null) {
            when {
                prevValue < currValue -> {
                    resultNumber += currValue - prevValue
                    currIndex += 2
                    prevIndex += 2
                }

                else -> {
                    resultNumber += prevValue
                    currIndex++
                    prevIndex++
                }
            }
        }
    }

    if (prevIndex < s.length)
        resultNumber += romanToIntMap[s[prevIndex]] ?: 0

    return resultNumber
}