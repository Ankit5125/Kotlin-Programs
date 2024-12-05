package com.DevKitu.FirstKTApp.KotlinFiles.LambdaExpretion

class IsPalindrome {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val isPalindrome : (String) -> Boolean = {
                it.lowercase().reversed() == it.lowercase()
            }

            print("Enter String : ")
            val str = readln()

            println("Is $str Palindrome ? : ${isPalindrome(str)}")

        }
    }
}