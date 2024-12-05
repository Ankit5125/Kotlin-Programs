package com.DevKitu.FirstKTApp.KotlinFiles.ClassesQuestion

import kotlin.math.floor

class StudentClass {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            println("Enter Your Name Here : ")
            val name = readln()

            println("Enter Your age : ")
            val age = readln().toInt()

            println("Enter Grade : ")
            val grade = readln().toFloat()

            val myStudent = Student(name, age, grade)
            println("is Promatable = ${myStudent.isPromtable()}")

        }
    }
}

class Student (val name : String, val age : Int , val grade : Float){
    fun isPromtable(): Boolean {
        return age > 18 && grade > 8
    }
}