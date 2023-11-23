package com.example.leetcodesolutions.solutions

import kotlin.text.StringBuilder

/*
[1678. Goal Parser Interpretation]
    https://leetcode.com/problems/goal-parser-interpretation/
*/
fun interpret(command: String): String {
    val str = StringBuilder()

    for (i in command.indices)
        when (command[i]) {
            'G' -> str.append('G')
            '(' -> {
                if (command[i + 1] == ')') str.append('o')
                if (command[i + 1] == 'a') str.append("al")
            }
        }

    return str.toString()
}