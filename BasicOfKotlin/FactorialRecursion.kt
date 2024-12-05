package com.DevKitu.FirstKTApp.KotlinFiles.BasicOfKotlin.Basics

class FactorialRecursion {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            print("Enter Number : ")
            val num = readLine()?.toIntOrNull()

            if (num == null){
                println("Invalid Input")
                return
            }
            else{
                println("Factorial : ${factorial(num)}")
            }

        }

        fun factorial(num : Int) : Int{

            if(num == 0){
                return 1
            }

            return num * factorial(num-1)
        }
    }
}