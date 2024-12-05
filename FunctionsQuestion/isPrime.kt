package com.DevKitu.FirstKTApp.KotlinFiles.FunctionsQuestion

class isPrime {

    companion object{

        @JvmStatic
        fun main(args : Array<String>){
            print("Enter Number : ")
            val input = readln()

            val num = input.toIntOrNull()
            if(num == null){
                return
            }

            println("Is Prime : ${isPrime(num)}")


        }

        fun isPrime(num : Int) : Boolean {

            if(num <= 1) return false

            for (i in 2 until num)
                if (num % i == 0)
                    return false

            return true

        }
    }
}