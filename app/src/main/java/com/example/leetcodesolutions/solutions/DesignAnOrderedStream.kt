package com.example.leetcodesolutions.solutions

/*
[1656. Design an Ordered Stream]
    https://leetcode.com/problems/design-an-ordered-stream/
*/
class OrderedStream(n: Int) {

    private val storage = MutableList(n) { "" }
    private var ptr = 0

    fun insert(idKey: Int, value: String): List<String> {
        val chunk = mutableListOf<String>()
        storage[idKey - 1] = value

        while (ptr < storage.size && storage[ptr] != "") {
            chunk.add(storage[ptr++])
        }
        return chunk
    }

}