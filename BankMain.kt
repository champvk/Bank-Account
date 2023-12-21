package com.example

fun main() {

    val VivekVermaAccount = BankAccount("Vivek Verma", 1500.78)
    VivekVermaAccount.deposit(1000.00)
    VivekVermaAccount.deposit(2000.00)
    VivekVermaAccount.withdraw(500.56)
    VivekVermaAccount.withdraw(200.22)
    VivekVermaAccount.deposit(500.50)
    VivekVermaAccount.displayTransactionHistory()

    println("Final Balance of ${VivekVermaAccount.AccountHolder} is Rs.${VivekVermaAccount.Balance}")
}
