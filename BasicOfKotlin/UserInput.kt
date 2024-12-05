package com.DevKitu.FirstKTApp.KotlinFiles.BasicOfKotlin.Basics

class UserInput {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            //Write a Kotlin program to take user input and display it.

            print("Please Enter your Name here : ")

            val name = readLine().toString()

            println("Your Name = $name")
        }
    }
}