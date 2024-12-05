package com.DevKitu.FirstKTApp.KotlinFiles.LambdaExpretion

class MaxFromArray {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val findMax : (nums : MutableList<Int>) -> Int = { nums ->
                var max = Int.MIN_VALUE

                for (i in 0 until nums.size){
                    if (max < nums[i])
                        max = nums[i]
                }

                max
            }

            print("Enter Length : ")
            val lengthValue = readln().toInt()

            val myArray = mutableListOf<Int>()

            println("Enter Elements Here : ")
            for (i in 0 until lengthValue){
                myArray.add(readln().toInt())
            }

            println("Array : $myArray \nMax : ${findMax(myArray)}")

        }
    }
}