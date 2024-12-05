package com.DevKitu.FirstKTApp.KotlinFiles.ControlFlow

class PosNegZero {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            println("Enter Number : ")
            val num = readLine()?.toIntOrNull()

            if (num == null){
                println("Invalid Input")
                return
            }

            if(num > 0){
                println("Number is Positive")
            }
            else if (num < 0){
                println("Number is Negative")
            }
            else{
                println("Number is Zero")
            }
        }
    }
}