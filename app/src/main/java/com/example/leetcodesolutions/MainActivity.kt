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
                    //709. To Lower Case: solutions -> ToLowerCase.kt
                    //771. Jewels and Stones: solutions -> JewelsAndStones.kt
                    //1108. Defanging an IP Address: solutions -> DefangingAnIPAddress.kt
                    //1221. Split a String in Balanced Strings: solutions -> SplitAStringInBalancedStrings.kt
                    //1281. Subtract the Product and Sum of Digits of an Integer: solutions -> SubtractTheProductAndSumOfDigitsOfAnInteger.kt
                    //1313. Decompress Run-Length Encoded List: solutions -> DecompressRunLengthEncodedList.kt
                    //1431. Kids With the Greatest Number of Candies: solutions -> KidsWithTheGreatestNumberOfCandies.kt
                    //1470. Shuffle the Array: solutions -> ShuffleTheArray.kt
                    //1476. Subrectangle Queries: solutions -> SubrectangleQueries.kt
                    //1486. XOR Operation in an Array: solutions -> XOROperationInAnArray.kt
                    //1512. Number of Good Pairs: solutions -> NumberOfGoodPairs.kt
                    //1603. Design Parking System: solutions -> DesignParkingSystem.kt
                    //1656. Design an Ordered Stream: solutions -> DesignAnOrderedStream.kt
                    //1672. Richest Customer Wealth: solutions -> RichestCustomerWealth.kt
                    //1678. Goal Parser Interpretation: solutions -> GoalParserInterpretation.kt
                    //1689. Partitioning Into Minimum Number Of Deci-Binary Numbers: solutions -> PartitioningIntoMinimumNumberOfDeciBinaryNumbers.kt
                    //1773. Count Items Matching a Rule: solutions -> CountItemsMatchingARule.kt
                    //1816. Truncate Sentence: solutions -> TruncateSentence.kt
                    //1920. Build Array from Permutation: solutions -> BuildArrayFromPermutation.kt
                    //1929. Concatenation of Array: solutions -> ConcatenationOfArray.kt
                    //2011. Final Value of Variable After Performing Operations: -> FinalValueOfVariableAfterPerformingOperations.kt
                    //2160. Minimum Sum of Four Digit Number After Splitting Digits: solutions -> MinimumSumOfFourDigitNumberAfterSplittingDigits.kt
                    //2235. Add Two Integers: solutions -> AddTwoIntegers.kt
                    //2413. Smallest Even Multiple: solutions -> SmallestEvenMultiple.kt
                    //2433. Find The Original Array of Prefix Xor: solutions -> FindTheOriginalArrayOfPrefixXor.kt
                    //2469. Convert the Temperature: solutions -> ConvertTheTemperature.kt
                    //2652. Sum Multiples: solutions -> SumMultiples.kt
                    //2769. Find the Maximum Achievable Number: solutions -> FindTheMaximumAchievableNumber.kt
                    //2798. Number of Employees Who Met the Target: solutions -> NumberOfEmployeesWhoMetTheTarget.kt
                    //2807. Insert Greatest Common Divisors in Linked List: solutions -> InsertGreatestCommonDivisorsInLinkedList.kt
                    //2824. Count Pairs Whose Sum is Less than Target: solutions -> CountPairsWhoseSumIsLessThanTarget.kt
                    //2894. Divisible and Non-divisible Sums Difference: solutions -> DivisibleAndNonDivisibleSumsDifference.kt
                }
            }
        }
    }
}