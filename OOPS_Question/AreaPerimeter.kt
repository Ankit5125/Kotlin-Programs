package com.DevKitu.FirstKTApp.KotlinFiles.OOPS_Question

class AreaPerimeter {

    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            println("Enter Width for Rectangle : ")
            val width = readln().toInt()

            println("Enter Height of Rectangle : ")
            val height = readln().toInt()

            val myRectangle = Rectangle(height, width)
            myRectangle.area()
            myRectangle.perimeter()

            println("Enter Radius of The Circle : ")
            val radius = readln().toFloat()

            val myCircle = Circle(radius)
            myCircle.area()
            myCircle.perimeter()

        }
    }
}

abstract class Shape {
    abstract fun area()
    abstract fun perimeter()
}

class Rectangle(val height : Int, val width : Int) : Shape() {
    override fun area() {
        println("Area = ${height * width}")
    }

    override fun perimeter() {
        println("Perimeter = ${2 * (height + width)}")
    }
}

class Circle (val radius : Float) : Shape() {
    override fun area(){
        println("Area = ${3.14 * radius * radius}")
    }

    override fun perimeter() {
        println("Perimeter = ${2 * 3.14 * radius}")
    }
}