package com.DevKitu.FirstKTApp.KotlinFiles.ControlFlow

class PatternTriangle {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            for (i in 0..4){
                for (j in i..4){
                    print("*")
                }
                println()
            }

        }
    }
}