package com.DevKitu.FirstKTApp.KotlinFiles.LambdaExpretion

class FilterListByK {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val wordStartingWithK : (String) -> Boolean = {
                x -> x[0] == 'k'
            }

            print("Enter Length : ")
            val input1 = readln()

            val l = input1.toIntOrNull()
            if (l == null || l < 0){
                return
            }

            val myList = mutableListOf<String>()

            println("Enter Names : ")
            for (i in 0 until l){
                val input = readln()

                if (wordStartingWithK(input.lowercase())){
                    myList.add(input)
                }
            }

            println("Words Starting With k : ${myList}")

        }

    }
}