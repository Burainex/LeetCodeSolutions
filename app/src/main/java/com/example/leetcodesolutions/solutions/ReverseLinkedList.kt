package com.example.leetcodesolutions.solutions

/*
[206. Reverse Linked List]
    https://leetcode.com/problems/reverse-linked-list/
*/
fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var curr = head

    while (curr != null) {
        val tmp = curr.next
        curr.next = prev
        prev = curr
        curr = tmp
    }

    return prev
}