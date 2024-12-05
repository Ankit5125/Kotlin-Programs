package com.DevKitu.FirstKTApp.KotlinFiles.BasicOfKotlin

import kotlin.time.times

class AreaPerimeterCircle {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            println("Enter Radius of Circle : ")
            val r = readLine()?.toIntOrNull()

            if (r == null){
                println("Invalid inputs")
                return
            }

            val perimeter = 2 * 3.14 * r
            val area = 3.14 * r * r

            println("Area = $area \nPerimeter = $perimeter")
        }
    }
}