package com.DevKitu.FirstKTApp.KotlinFiles.ClassesQuestion

class BookClass {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val Title = "Kitu's Book"
            val Author = "Ankit Savaliya"
            val PYear = 2024

            val Book = Book(Title, Author, PYear)
            Book.DesplayDetails()

        }
    }
}

class Book(val Title : String , val Author : String, val PYear : Int){
    fun DesplayDetails(){
        println("Title : $Title")
        println("Author: $Author")
        println("Published Year: $PYear")
    }
}