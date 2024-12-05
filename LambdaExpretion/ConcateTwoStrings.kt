package com.DevKitu.FirstKTApp.KotlinFiles.LambdaExpretion

class ConcateTwoStrings {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val concate : (s1 : String, s2 : String) -> String = {
                s1, s2 ->

                var answer = StringBuilder("")
                answer.append(s1)
                answer.append(s2)

                answer.toString()

            }

            print("Enter String 1 : ")
            val str1 = readln()

            print("Enter String 2 : ")
            val str2 = readln()

            println("String 1 : $str1\tString 2 : $str2 \nConcated String : ${concate(str1, str2)}")

        }
    }
}