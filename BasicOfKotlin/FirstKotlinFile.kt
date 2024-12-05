package com.DevKitu.FirstKTApp.KotlinFiles.BasicOfKotlin.Basics

public class FirstKotlinFile{
    companion object{

        @JvmStatic
        fun main(args : Array<String>){

            println("Hello World")
            println("Hola")
            println("Bonjour")

            val a : String = "HEHEHE"

            val b : Int = 20
            val c : Int = 10


            println(a +" "+ (b - c )+" "+ c)

            val name : String = "DevKitu"

            println("\n")
            println("Hello $name! Welcome to Kotlin World")
        }

    }
}