package com.DevKitu.FirstKTApp.KotlinFiles.ControlFlow

class VowelConsonent {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            print("Enter Character : ")
            val input = readln()

            val ch = input[0]

            if(ch.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')){
                println("Character is Vowel")
            }
            else{
                println("Character is Consonent")
            }
        }
    }
}