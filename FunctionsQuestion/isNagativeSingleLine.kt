package com.DevKitu.FirstKTApp.KotlinFiles.FunctionsQuestion

class isNagativeSingleLine {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            print("Enter Number : ")
            val input = readLine()

            val num = input?.toIntOrNull()

            if(num == null){
                println("Invalid Input")
                return
            }

            println("Is Nagative : ${isNagative(num)}")

        }

        fun isNagative(num : Int): Boolean = num < 0
    }
}