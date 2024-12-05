package com.DevKitu.FirstKTApp.KotlinFiles.FunctionsQuestion

class PrintEvenOddNums {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val arr = mutableListOf<Int>()

            for (i in 0..20){
                arr.add(i)
            }

            printEvenOddNums(arr)

        }

        fun printEvenOddNums(arr : MutableList<Int>) {

            val EvenArr = mutableListOf<Int>()
            val OddArr = mutableListOf<Int>()

            for (i in arr.indices){
                if(arr[i] % 2 == 0){
                    EvenArr.add(arr[i])
                }
                else{
                    OddArr.add(arr[i])
                }
            }

            print("Even Nums : ")
            EvenArr.forEach { print("$it ") }
            println()
            println()

            print("Odd Nums : ")
            OddArr.forEach { print("$it ") }
        }
    }
}