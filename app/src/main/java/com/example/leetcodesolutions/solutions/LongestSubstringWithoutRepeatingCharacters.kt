package com.example.leetcodesolutions.solutions

fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) return 0

    var left = 0
    var length = 0
    val characterData = mutableMapOf<Char, Int>()

    for (right in s.withIndex()) {
        if (characterData.containsKey(right.value) && characterData[right.value]!! >= left)
            left = characterData[right.value]!! + 1

        characterData[right.value] = right.index
        length = length.coerceAtLeast(right.index - left + 1)
    }

    return length
}

