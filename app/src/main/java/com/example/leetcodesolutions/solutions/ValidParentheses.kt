package com.example.leetcodesolutions.solutions

/*
[20. Valid Parentheses]
    https://leetcode.com/problems/valid-parentheses/
*/
fun isValid(s: String): Boolean {
    for (ch in s) {
        when (ch) {
            ')' -> {
                if (Stack.isEmpty() || ch != Stack.pop() + 1) return false
            }

            ']' -> {
                if (Stack.isEmpty() || ch != Stack.pop() + 2) return false
            }

            '}' -> {
                if (Stack.isEmpty() || ch != Stack.pop() + 2) return false
            }

            else -> {
                Stack.push(ch)
            }
        }
    }

    return Stack.isEmpty()
}

object Stack {
    private val storage = mutableListOf<Char>()

    fun push(ch: Char) {
        storage.add(ch)
    }

    fun pop(): Char {
        if (storage.isEmpty()) {
            throw Exception("Stack is empty")
        }
        return storage.removeLast()
    }

    fun isEmpty(): Boolean {
        return storage.isEmpty()
    }
}