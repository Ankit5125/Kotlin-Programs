package com.DevKitu.FirstKTApp.KotlinFiles.ControlFlow

class SumBetweenTwoNumbers {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            println("Enter Numbers : ")
            val num1 = readLine()?.toIntOrNull()
            val num2 = readLine()?.toIntOrNull()

            if(num1 == null || num2 == null){
                println("Invalid Inputs...")
                return
            }

            var sum = 0
            for (i in num1..num2){
                sum+=i
            }

            println("Sum = $sum")
        }
    }
}