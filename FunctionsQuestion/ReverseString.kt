package com.DevKitu.FirstKTApp.KotlinFiles.FunctionsQuestion

class ReverseString {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            print("Enter String : ")
            val str = readLine().toString()

            val reverseString = reverseStr(str)
            println("Reversed String : $reverseString")
        }

        fun reverseStr(str : String): String {

            var sb = StringBuilder(" ")


            for (i in str.length-1 downTo 0){
                sb.append(str[i])
            }

            return sb.toString()
        }
    }
}