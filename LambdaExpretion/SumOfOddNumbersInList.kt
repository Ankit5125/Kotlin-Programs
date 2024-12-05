package com.DevKitu.FirstKTApp.KotlinFiles.LambdaExpretion

class SumOfOddNumbersInList {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val sumOfOddNumbers : (MutableList<Int>) -> Int ={ nums ->

                var ans = 0
                val oddNums = nums.filter { it % 2 != 0 }

                print("Odd Numbers : ${oddNums.joinToString(", ")}")
                for (num in nums){
                    if (num % 2 != 0) {
                        ans += num

                    }
                }

                ans
            }

            print("Enter Length : ")
            val l = readln().toInt()

            val myList = mutableListOf<Int>()

            println("Enter Elements Here : ")
            for (i in 0 until l){
                myList.add(readln().toInt())
            }

            println("List = $myList \nSum Of Odd Numbers : \n${sumOfOddNumbers(myList)}")
        }
    }
}