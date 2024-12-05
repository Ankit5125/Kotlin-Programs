package com.DevKitu.FirstKTApp.KotlinFiles.OOPS_Question

class Decorator {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            var myTask = myTask(false, false)
            println("Is Bold Enabled ? : ${myTask.isBold}")
            println("Is Italic Enabled ? : ${myTask.isItalic}")


            println("\nNow Bold is True...")
            myTask.boldDecorator(true)
            println("Is Bold Enabled ? : ${myTask.isBold}")
            println("Is Italic Enabled ? : ${myTask.isItalic}")

            println("\nNow Italic is True...")
            myTask.italicDecorator(true)
            println("Is Bold Enabled ? : ${myTask.isBold}")
            println("Is Italic Enabled ? : ${myTask.isItalic}")

        }
    }
}

abstract class myDecorator {

    abstract fun boldDecorator(isBold : Boolean)
    abstract fun italicDecorator(isItalic : Boolean)
}

class myTask(var isBold : Boolean , var isItalic : Boolean) : myDecorator() {
    override fun boldDecorator(isBold : Boolean){
        this.isBold = isBold
    }

    override fun italicDecorator(isItalic: Boolean) {
        this.isItalic = isItalic
    }
}