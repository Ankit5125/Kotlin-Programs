package com.DevKitu.FirstKTApp.KotlinFiles.LambdaExpretion

class MultiplyTwonumbers {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val multi : (Int, Int) -> Int = {
                x, y -> x * y
            }

            print("Enter Number 1 : ")
            val in1 = readln()

            print("Enter Number 2 : ")
            val in2 = readln()

            val num1 = in1.toIntOrNull()
            val num2 = in2.toIntOrNull()

            if (num1 == null || num2 == null){
                return
            }


            println("Multiplication : ${multi(num1, num2)}")


        }
    }
}