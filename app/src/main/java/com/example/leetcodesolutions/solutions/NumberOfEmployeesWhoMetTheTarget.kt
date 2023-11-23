package com.example.leetcodesolutions.solutions

/*
[2798. Number of Employees Who Met the Target]
    https://leetcode.com/problems/number-of-employees-who-met-the-target/
*/
fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int = hours.count { it >= target }