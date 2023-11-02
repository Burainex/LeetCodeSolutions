package com.example.leetcodesolutions.solutions

/*
[2469. Convert the Temperature]
    https://leetcode.com/problems/convert-the-temperature/
*/
fun convertTemperature(celsius: Double): DoubleArray = doubleArrayOf(
        celsius + 273.15,
        celsius * 1.8 + 32.0
    )