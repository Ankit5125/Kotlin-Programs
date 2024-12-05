package com.DevKitu.FirstKTApp.KotlinFiles.BasicOfKotlin.Basics

class BasicMaths {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            var num1: Int
            var num2: Int
            var operator: String
            var proceedAhead: Boolean = true

            while (proceedAhead) {

                // Input for number 1
                print("Enter Num 1: ")
                val input1 = readLine()?.toIntOrNull()
                if (input1 == null) {
                    println("Invalid input. Please enter a valid integer.")
                    continue // Skip to the next iteration of the loop
                } else {
                    num1 = input1
                }

                // Input for number 2
                print("Enter Num 2: ")
                val input2 = readLine()?.toIntOrNull()
                if (input2 == null) {
                    println("Invalid input. Please enter a valid integer.")
                    continue
                } else {
                    num2 = input2
                }

                // Input for operator
                print("Enter Operator (+, -, *, /): ")
                operator = readLine() ?: ""
                when (operator) {
                    "+" -> println("Addition = ${num1 + num2}")
                    "-" -> println("Subtraction = ${num1 - num2}")
                    "*" -> println("Multiplication = ${num1 * num2}")
                    "/" -> {
                        if (num2 == 0) {
                            println("Cannot divide by zero.")
                        } else {
                            println("Division = ${num1.toDouble() / num2}")
                        }
                    }
                    else -> {
                        println("Invalid operator. Please use +, -, *, or /.")
                        continue
                    }
                }

                // Ask to continue
                print("Want to proceed ahead? (true or false): ")
                proceedAhead = readLine()?.toBoolean() ?: false
            }

            println("Program terminated. Goodbye!")
        }
    }
}
