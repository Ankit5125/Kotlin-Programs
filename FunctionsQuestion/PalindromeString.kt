package com.DevKitu.FirstKTApp.KotlinFiles.FunctionsQuestion

class PalindromeString {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            print("Enter String : ")
            val str = readLine().toString()

            println("is Palindrome : ${isPalindrome(str)}")

        }

        fun isPalindrome(str : String) : Boolean {

            var sb = StringBuilder("")

            for (i in str.length-1 downTo 0){
                sb.append(str[i])
            }

            return str == sb.toString()
        }
    }
}