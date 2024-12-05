package com.DevKitu.FirstKTApp.KotlinFiles.LambdaExpretion

class IsEven {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val isEven : (Int) -> Boolean = { x -> x % 2 == 0 }

            print("Enter Number : ")
            val input = readln()

            val num = input.toIntOrNull()
            if (num == null){
                return
            }

            println("$num is Even ? : ${isEven(num)}")

        }
    }
}