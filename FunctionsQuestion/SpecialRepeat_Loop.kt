package com.DevKitu.FirstKTApp.KotlinFiles.FunctionsQuestion

class SpecialRepeat_Loop{

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            print("Enter Num : ")
            val input = readln()

            val num = input.toIntOrNull()

            if(num == null){
                println("Invalid Input...")
                return
            }

//            repeat(10) {
//                println("100")
//            }

            printPattern(num)

        }

        fun printPattern(num : Int) {

            repeat(num){
                println("* ".repeat(num))
            }

        }
    }

}