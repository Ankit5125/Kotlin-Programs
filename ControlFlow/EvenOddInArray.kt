package com.DevKitu.FirstKTApp.KotlinFiles.ControlFlow

class EvenOddInArray {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val arr = arrayOf(1,2,4,5,6,34,636,36,802,63,50,7,3,3,6,2,62,62,7,21,28,8,99,84,36,2,2)

            var even = 0
            var odd = 0

            val evenarr = mutableListOf<Int>()
            val oddarr = mutableListOf<Int>()

            for(i in arr.indices){
                if (arr[i] % 2 == 0){
                    even++
                    evenarr.add(arr[i])
                }
                else{
                    odd++
                    oddarr.add(arr[i])
                }
            }

            println()
            println("Even Numbers : $even")
            println("Odd Numbers : $odd")

            println()
            println("Even Elements : ")
            evenarr.forEach { print("$it ") }

            println()
            println()
            println("Odd Elements : ")
            oddarr.forEach { print("$it ") }

        }
    }
}