package com.DevKitu.FirstKTApp.KotlinFiles.BasicOfKotlin.Basics

class LeapYear {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            println("Enter Year : ")
            val year = readLine()?.toIntOrNull()

            if (year == null){
                println("Invalid Input...")
                return
            }
            else{
                if(year % 4 == 0){
                    println("Leap Year")
                }
                else{
                    println("Non Leap Year")
                }
            }

        }
    }
}