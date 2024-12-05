package com.DevKitu.FirstKTApp.KotlinFiles.FunctionsQuestion

class countVowels {

    companion object{

        val vowel = arrayOf('a', 'e', 'i', 'o', 'u')

        @JvmStatic
        fun main(args: Array<String>) {

            print("Enter String : ")
            val str = readLine().toString()

            val lenght = str.length
            val vowels = getVowels(str.lowercase())

            println("Vowels : $vowels \nConsonents : ${lenght-vowels}")

        }

        fun getVowels(str : String): Int{
            var ans = 0

            for (i in 0..str.length-1){
                if(vowel.contains(str[i])){
                    ans++
                }
            }

            return ans
        }
    }
}