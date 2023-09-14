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
                }
            }
        }
    }
}