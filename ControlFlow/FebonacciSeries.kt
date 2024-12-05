package com.DevKitu.FirstKTApp.KotlinFiles.ControlFlow

class FebonacciSeries {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            print("Enter Index till Number You Want to Print : ")
            val num = readLine()?.toIntOrNull()

            if(num == null){
                print("Invalid Number...")
                return
            }

            var f1 = 0
            var f2 = 1

            print("$f1 $f2 ")
            for(i in 0..num - 1){
                var f3 = f2 + f1
                print("$f3 ")

                f1 = f2
                f2 = f3
            }

        }
    }
}