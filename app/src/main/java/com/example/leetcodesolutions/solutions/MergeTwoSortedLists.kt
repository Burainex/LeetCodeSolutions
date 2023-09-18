package com.example.leetcodesolutions.solutions

/*
[21. Merge Two Sorted Lists]
    https://leetcode.com/problems/merge-two-sorted-lists/
*/
fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val head = ListNode(0)
    var list1Node = list1
    var list2Node = list2
    var currentNode: ListNode? = head

    while (list1Node != null && list2Node != null) {
        if (list1Node.`val` < list2Node.`val`) {
            currentNode!!.next = list1Node
            list1Node = list1Node.next
        } else {
            currentNode!!.next = list2Node
            list2Node = list2Node.next
        }
        currentNode = currentNode.next
    }

    currentNode!!.next = list1Node ?: list2Node
    return head.next
}