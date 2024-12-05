package com.DevKitu.FirstKTApp.KotlinFiles.LambdaExpretion

class CountVowelsInString {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val vowels = listOf('a', 'e', 'i', 'o', 'u')

            val countVowels : (String) -> Int = { str ->

                var ans = 0

                for (i in 0 until str.length){
                    if (vowels.contains(str[i])){
                        ans++
                    }
                }

                ans
            }

            print("Enter String Here : ")
            val str = readln()

            println("String = $str \nVowels = ${countVowels(str.lowercase())}")

        }
    }
}