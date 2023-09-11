package com.example.leetcodesolutions.solutions

/*
[2. Add Two Numbers]
    https://leetcode.com/problems/add-two-numbers/description/
*/

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var sum = l1!!.`val` + l2!!.`val`
    val outputNode = ListNode(sum % 10)
    var l3 = outputNode

    var l1Curr = l1.next
    var l2Curr = l2.next

    while (l1Curr != null || l2Curr != null || sum / 10 != 0) {
        val l1Value = l1Curr?.`val` ?: 0
        val l2Value = l2Curr?.`val` ?: 0
        sum = l1Value + l2Value + sum / 10

        l1Curr = l1Curr?.next
        l2Curr = l2Curr?.next

        l3.next = ListNode(sum % 10)
        l3 = l3.next!!
    }
    return outputNode
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}