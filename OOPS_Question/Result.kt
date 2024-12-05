package com.DevKitu.FirstKTApp.KotlinFiles.OOPS_Question

class Result {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val newTask = myOperation()

            println("1. Task is Successful")
            newTask.Success("Task Done Successful")

            println("2. Task Failed")
            newTask.Error("Task Failed")

        }
    }
}

abstract class myResult(){
    abstract fun Success (message : String)
    abstract fun Error (message: String)
}

class myOperation : myResult(){
    override fun Error(message: String) {
        println("Error Occured While Executing the Programme : $message")
    }

    override fun Success(message: String) {
        println("Successfully Executed Programme : $message")
    }
}