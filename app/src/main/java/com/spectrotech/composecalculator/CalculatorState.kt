package com.spectrotech.composecalculator

import com.spectrotech.composecalculator.util.CalculatorAction

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorAction.CalculatorOperation? = null
)
