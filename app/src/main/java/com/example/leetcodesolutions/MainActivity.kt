package com.example.leetcodesolutions

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.leetcodesolutions.ui.theme.LeetCodeSolutionsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LeetCodeSolutionsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //[List of tasks]
                    //1. Two Sum : solutions -> TwoSumTask.kt
                    //2. Add Two Numbers : solutions -> AddTwoNumbersTask.kt
                    //3. Longest Substring Without Repeating Characters: solutions -> LongestSubstringWithoutRepeatingCharacters.kt
                    //4. Median of Two Sorted Arrays: solutions -> MedianOfTwoSortedArrays.kt
                    //9. Palindrome Number: solutions -> PalindromeNumber.kt
                    //13. Roman to Integer: solutions -> RomanToInteger.kt
                    //14. Longest Common Prefix: solutions -> LongestCommonPrefix.kt
                    //20. Valid Parentheses: solutions -> ValidParentheses.kt
                    //21. Merge Two Sorted Lists: solutions -> MergeTwoSortedLists.kt
                    //26. Remove Duplicates from Sorted Array: solutions -> RemoveDuplicatesFromSortedArray.kt
                    //27. Remove Element: solutions -> RemoveElement.kt
                    //28. Find the Index of the First Occurrence in a String: solutions -> FindIndexOfFirstOccurrenceInString.kt
                    //35. Search Insert Position: solutions -> SearchInsertPosition.kt
                    //58. Length of Last Word: solutions -> LengthOfLastWord.kt
                    //66. Plus One: solutions -> PlusOne.kt
                    //83. Remove Duplicates from Sorted List: solutions -> RemoveDuplicatesFromSortedList.kt
                    //88. Merge Sorted Array: solutions -> MergeSortedArray.kt
                    //121. Best Time to Buy and Sell Stock: solutions -> BestTimeToBuyAndSellStock.kt
                    //136. Single Number: solutions -> SingleNumber.kt
                    //206. Reverse Linked List: solutions -> ReverseLinkedList.kt
                    //389. Find the Difference: solutions -> FindTheDifference.kt
                    //1108. Defanging an IP Address: solutions -> DefangingAnIPAddress.kt
                    //1656. Design an Ordered Stream: solutions -> DesignAnOrderedStream.kt
                    //1773. Count Items Matching a Rule: solutions -> CountItemsMatchingARule.kt
                    //1816. Truncate Sentence: solutions -> TruncateSentence.kt
                    //1920. Build Array from Permutation: solutions -> BuildArrayFromPermutation.kt
                    //1929. Concatenation of Array: solutions -> ConcatenationOfArray.kt
                    //2652. Sum Multiples: solutions -> SumMultiples.kt
                }
            }
        }
    }
}