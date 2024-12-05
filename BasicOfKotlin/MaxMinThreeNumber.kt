package com.DevKitu.FirstKTApp.KotlinFiles.BasicOfKotlin.Basics

class MaxMinThreeNumber {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {

            println("Enter Num1 : ")
            val num1 = readLine()?.toIntOrNull()

            println("Enter Num2 : ")
            val num2 = readLine()?.toIntOrNull()

            println("Enter Num3 : ")
            val num3 = readLine()?.toIntOrNull()

            var max : Int = 0
            var min : Int

            if(num3 == null || num2 == null || num1 == null){
                println("Please Enter Valid Inputs...")
            }
            else{
                if(num1 > num2 && num1 > num3){
                    max = num1
                }
                else if(num2 > num1 && num2 > num3){
                    max = num2
                }
                else if (num3 > num2 && num3 > num1){
                    max = num3
                }
                println("Max = $max")
            }

        }
    }
}