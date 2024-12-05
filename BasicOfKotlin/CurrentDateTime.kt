package com.DevKitu.FirstKTApp.KotlinFiles.BasicOfKotlin.Basics

import java.text.SimpleDateFormat
import java.util.Date

class CurrentDateTime {
    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            var date = Date()

            val DateFormater = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")

            val formattedDate = DateFormater.format(date)

            println(formattedDate)

        }
    }
}