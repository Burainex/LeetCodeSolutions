package com.example.leetcodesolutions

/*
[2160. Minimum Sum of Four Digit Number After Splitting Digits]
    https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
*/
fun minimumSum(num: Int): Int {
    val arr = IntArray(4)
    var number = num
    arr[0] = number % 10
    number /= 10

    for (i in 1..3) {
        var tmp = number % 10
        arr[i] = tmp

        if (arr[i] < arr[0]) {
            arr[i] = arr[0]
            arr[0] = tmp
        }

        if (arr[i] < arr[i - 1]) {
            tmp = arr[i]
            arr[i] = arr[i - 1]
            arr[i - 1] = tmp
        }

        number /= 10
    }

    return if (arr[1] < arr[2]) {
        (arr[0] * 10 + arr[2]) + (arr[1] * 10 + arr[3])
    } else
        (arr[0] * 10 + arr[1]) + (arr[2] * 10 + arr[3])
}