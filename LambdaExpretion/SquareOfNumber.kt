package com.DevKitu.FirstKTApp.KotlinFiles.LambdaExpretion

class SquareOfNumber {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val square : (Double) -> Double = {
                x -> Math.pow(x, 2.0)
            }

            print("Enter number : ")
            val input = readln()

            val num = input.toDouble()

            println("Squre of : $num = ${square(num)}")

        }
    }
}