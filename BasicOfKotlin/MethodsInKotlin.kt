package com.DevKitu.FirstKTApp.KotlinFiles.BasicOfKotlin.Basics

class MethodsInKotlin {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val num1 = 20
            val num2 = 10

            println("Sum : ${sum(num1, num2)}")

        }

        fun sum(num1 : Int , num2 : Int) : Int {
            return num1 + num2
        }
    }
}