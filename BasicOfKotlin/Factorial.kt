package com.DevKitu.FirstKTApp.KotlinFiles.BasicOfKotlin.Basics

class Factorial {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            println("Enter Number : ")
            var num = readLine()?.toIntOrNull()

            if (num == null || num < 0) {
                println("Invalid input. Please enter a non-negative integer.")
                return
            }

            var ans = 1
            for( i in 1..num){
                ans *= i
            }

            println("Factorial = $ans")
        }
    }
}