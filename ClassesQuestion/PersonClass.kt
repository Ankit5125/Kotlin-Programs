package com.DevKitu.FirstKTApp.KotlinFiles.ClassesQuestion

class PersonClass {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val Dhruv = Person("Dhruv", 18, "India")
            Dhruv.printDetails()

        }
    }
}

class Person(val name : String, val age : Int, val country : String) {
    fun printDetails(){
        println("Name : $name")
        println("Age : $age")
        println("Country : $country")
    }
}