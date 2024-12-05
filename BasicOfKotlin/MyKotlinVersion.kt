package com.DevKitu.FirstKTApp.KotlinFiles.BasicOfKotlin.Basics

class MyKotlinVersion {
    companion object{
        @JvmStatic

        fun main(args : Array<String>){

            //Write a Kotlin program to find out what version of Kotlin you are using.

            val kotlinVeersion = KotlinVersion.CURRENT

            println(kotlinVeersion)
        }
    }
}