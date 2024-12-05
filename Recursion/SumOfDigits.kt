package com.DevKitu.FirstKTApp.KotlinFiles.Recursion

class SumOfDigits {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            print("Enter Number : ")
            val input = readln()

            val num = input.toIntOrNull()

            if (num == null){
                return
            }

            println("Sum : ${sumOfDigit(num)}")

        }

        fun sumOfDigit(num : Int) : Int{
            if(num < 10){
                return num
            }

            return num % 10 + sumOfDigit(num / 10)
        }
    }
}