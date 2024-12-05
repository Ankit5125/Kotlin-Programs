package com.DevKitu.FirstKTApp.KotlinFiles.LambdaExpretion

class AvarageOfList {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val soutAvg : (MutableList<Int>) -> Float = {
                if (it.isEmpty()){
                    println("empty List")
                    0.0f
                }
                else{
                    val sum = it.sum()
                    (sum/it.size).toFloat()
                }
            }

            print("Enter Length : ")
            val lengthInput = readln()

            val l = lengthInput.toIntOrNull()
            if (l == null || l < 0 ){
                return
            }

            val mylist = mutableListOf<Int>()

            for (i in 0 until  l){
                print("Enter Element $i : ")
                val input = readln()

                val num = input.toIntOrNull()
                if (num == null){
                    return
                }

                mylist.add(num)
            }

            println()
            println("Avarage = ${soutAvg(mylist)}")


        }
    }
}