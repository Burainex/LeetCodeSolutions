package com.example.leetcodesolutions.solutions

/*
[2807. Insert Greatest Common Divisors in Linked List]
    https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
*/
fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
    var a = head
    var b = head?.next
    var c: ListNode?

    while (b != null) {
        c = ListNode(greatestCommonDivisor(a!!.`val`, b.`val`))
        a.next = c
        c.next = b

        a = b
        b = b.next
    }

    return head
}

fun greatestCommonDivisor(num1: Int, num2: Int): Int {
    var n1 = num1
    var n2 = num2
    var tmp: Int

    while (n1 % n2 > 0) {
        tmp = n1 % n2
        n1 = n2
        n2 = tmp
    }

    return n2
}