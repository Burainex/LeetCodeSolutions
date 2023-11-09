package com.example.leetcodesolutions.solutions

/*
[1603. Design Parking System]
    https://leetcode.com/problems/design-parking-system/
*/
class ParkingSystem(big: Int, medium: Int, small: Int) {
    private val parkingSpace = arrayOf(big, medium, small)
    fun addCar(carType: Int): Boolean = parkingSpace[carType - 1]-- > 0
}