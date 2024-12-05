package com.DevKitu.FirstKTApp.KotlinFiles.FunctionsQuestion

class Greetings {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            print("Enter Name : ")
            val name = readLine().toString()

            println(greet(name))

        }

        fun greet(name : String) : String{
            return "Good Evening, $name"
        }
    }
}