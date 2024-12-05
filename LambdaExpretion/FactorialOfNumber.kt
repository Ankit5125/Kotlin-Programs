package com.DevKitu.FirstKTApp.KotlinFiles.LambdaExpretion

class FactorialOfNumber {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {


            // Define a local function for recursion
            val factByLambda: (Int) -> Int = { n ->
                var ans = 1

                for (i in 1..n)
                    ans *= i

                ans
            }

            val num = 5
            println("Factorial of $num = ${factByLambda(num)}") // Output: Factorial of 5 = 120
        }

    }
}
