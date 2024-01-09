package com.example.leetcodesolutions.solutions

/*
[67. Add Binary]
    https://leetcode.com/problems/add-binary/
*/
fun addBinary(a: String, b: String): String =
    (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)