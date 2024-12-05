package com.DevKitu.FirstKTApp.KotlinFiles.LambdaExpretion

class AvgOfSquareOfNumsOfList {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val avgOfSqrOfNums : (myList : MutableList<Int>) -> Double = {
                myList ->

                var ans = 0.0

                for (i in 0 until myList.size)
                    ans += Math.pow(myList[i].toDouble(),2.0)

                ans/myList.size
            }

            print("Enter Length of the String : ")
            val l = readln().toInt()

            val myList = mutableListOf<Int>()

            println("Enter Elements Here : ")
            for (i in 0 until l){
                print("Element $i : ")
                myList.add(readln().toInt())
            }

            println("Avarage of Square of Nums = ${avgOfSqrOfNums(myList)}")

        }
    }
}