package com.DevKitu.FirstKTApp.KotlinFiles.ClassesQuestion

class BankAccountClass {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var choice: Int
            var account: BankAccount? = null

            while (true) {
                println("\n\n")
                println("1 -> Deposit")
                println("2 -> Withdrawal")
                println("3 -> Balance Inquiry")
                println("4 -> Print Details")
                println("5 -> Create an Account")
                println("6 -> Exit") // Added an option to exit

                println()
                choice = readln().toInt()

                when (choice) {
                    1 -> {
                        if (account == null) {
                            println("Create Account First....")
                        } else {
                            print("Enter Amount: ")
                            val amount = readln().toInt()
                            account.deposit(amount)
                            println("Available Balance: ${account.BankBalance()} \n")
                        }
                    }

                    2 -> {
                        if (account == null) {
                            println("Create Account First....\n")
                        } else {
                            print("Enter Amount: ")
                            val amount = readln().toInt()
                            if (amount > account.BankBalance()) {
                                println("Not Enough Balance...\n")
                            } else {
                                account.withdrawal(amount) // Corrected method name
                                println("Available Balance: ${account.BankBalance()} \n")
                            }
                        }
                    }

                    3 -> {
                        if (account == null) {
                            println("Create Account First....")
                        } else {
                            println("Available Balance: ${account.BankBalance()} \n")
                        }
                    }

                    4 -> {
                        if (account == null) {
                            println("Create Account First....")
                        } else {
                            account.printDetails() // Corrected method name
                        }
                    }

                    5 -> {
                        println("\n\nWelcome To Bank\n")
                        print("Enter Name: ")
                        val name = readln()

                        print("Choose Account Number: ")
                        val accountNumber = readln().toLong()

                        print("Enter Initial Balance: ")
                        val balance = readln().toInt()

                        account = BankAccount(name, accountNumber, balance)

                        println("\nBank Account Created Successfully...\n\n")
                    }

                    6 -> {
                        println("Exiting the program...")
                        return // Exit the program
                    }

                    else -> {
                        println("Enter Proper Value...")
                    }
                }
            }
        }
    }
}

class BankAccount(val name: String, val accountNumber: Long, var BankBalance: Int) {

    fun deposit(amount: Int) {
        BankBalance += amount
        println("Amount Added Successfully")
    }

    fun withdrawal(amount: Int) { // Corrected method name
        BankBalance -= amount
        println("Amount Debited Successfully") // Corrected spelling
    }

    fun BankBalance(): Int {
        return BankBalance
    }

    fun printDetails() { // Corrected method name
        println("\nHere are The Details Of The Account:")
        println("Name = $name")
        println("Account Number = $accountNumber")
        println("Balance = $BankBalance")
        println("Thank You")
    }
}