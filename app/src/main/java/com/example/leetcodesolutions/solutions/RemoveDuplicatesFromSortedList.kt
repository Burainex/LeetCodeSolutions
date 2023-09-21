package com.example.leetcodesolutions.solutions

/*
[83. Remove Duplicates from Sorted List]
    https://leetcode.com/problems/remove-duplicates-from-sorted-list/
*/
fun deleteDuplicates(head: ListNode?): ListNode? {
    var currNode: ListNode? = head ?: return null

    while (currNode != null) {
        if (currNode.next != null && currNode.`val` == currNode.next!!.`val`) {
            if (currNode.next!!.next != null) currNode.next = currNode.next!!.next
            else currNode.next = null
        } else
            currNode = currNode.next
    }

    return head
}