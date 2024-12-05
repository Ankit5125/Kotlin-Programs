package com.DevKitu.FirstKTApp.KotlinFiles.ControlFlow

class MultiplicationTable {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            print("Enter number : ")
            val num = readLine()?.toIntOrNull()

            if (num == null){
                println("Invalid Input..")
                return
            }

            for (i in 1..10){
                println("$num * $i = ${num*i}")
            }

        }
    }
}