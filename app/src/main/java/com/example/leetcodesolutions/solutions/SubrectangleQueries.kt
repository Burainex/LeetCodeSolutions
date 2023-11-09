package com.example.leetcodesolutions.solutions

/*
[1476. Subrectangle Queries]
    https://leetcode.com/problems/subrectangle-queries/
*/
class SubrectangleQueries(rectangle: Array<IntArray>) {
    val rect = rectangle
    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        for (i in row1..row2)
            for (j in col1..col2)
                rect[i][j] = newValue
    }

    fun getValue(row: Int, col: Int): Int = rect[row][col]
}