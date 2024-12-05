package com.DevKitu.FirstKTApp.KotlinFiles.LambdaExpretion

class ConvertListToUpperCase {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val convertToUpperCase : (MutableList<String>)  -> MutableList<String> = {
                for (i in 0 until  it.size){
                    it[i] = it[i].uppercase()
                }

                it
            }

            print("Enter Length : ")
            val lengthOfList = readln()

            val l = lengthOfList.toIntOrNull()
            if ( l == null || l < 0 ){
                return
            }

            var myList = mutableListOf<String>()

            println("Enter Your Strings Here : ")
            for (i in 0 until l){
                myList.add(readln())
            }

            println("Before : $myList")
            myList = convertToUpperCase(myList)
            println("After : $myList")

        }
    }
}