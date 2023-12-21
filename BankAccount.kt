package com.example

class BankAccount(var AccountHolder: String, var Balance: Double ) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        Balance += amount
        transactionHistory.add("$AccountHolder deposited $amount in the account")
    }

    fun withdraw(amount: Double){
        if(amount <= Balance){
            Balance -= amount
            transactionHistory.add("$AccountHolder withdrew $amount from the account")
        }
        else{
            println("Balance is low!!!")
        }
    }

    fun displayTransactionHistory(){
        println("Transaction History of $AccountHolder")
        for(transaction in transactionHistory){
            println(transaction)
        }
    }
}
