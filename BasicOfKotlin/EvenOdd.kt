package com.DevKitu.FirstKTApp.KotlinFiles.BasicOfKotlin.Basics

class EvenOdd {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {

            println("Enter Number Here : ")
            val num = readLine()?.toIntOrNull()

            if (num == null){
                println("Please Enter Valid Integer...")
            }
            else{
                if(num % 2 == 0){
                    println("Number is Even.")
                }
                else{
                    println("Number is Odd.")
                }
            }


        }
    }
}