package com.DevKitu.FirstKTApp.KotlinFiles.ClassesQuestion

import android.icu.text.ListFormatter.Width

class RectangleClass {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            print("Enter Width of Ractangle : ")
            val width = readln().toInt()

            print("Enter Width of Ractangle : ")
            val length = readln().toInt()

            val myRect = Rectangle(width, length)
            myRect.printDetails()
            myRect.calculateArea()

        }
    }
}

class Rectangle (val width: Int, val length : Int){
    fun printDetails(){
        println("Width = $width, Length = $length")
    }

    fun calculateArea(){
        println("Area = ${width * length}")
    }
}