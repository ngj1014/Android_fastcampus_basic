package com.example.myapplication.Kotlin
/*
fun main(array: Array<String>){
    val account:Account= Account("남궁광","1995/11/8",5000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkBalance())

    println()
    val account2:Account2= Account2("jacky","1993/1/14")
    println(account2.checkBalance())
    val account3:Account2= Account2("jacky","1993/1/14",3000)
    println(account3.checkBalance())

}

//2)은행 계좌 만들기
// -계좌 생성기능(이름,생년월일)
// - 잔고를 확인하는 기능
// - 출금기능
// - 예금기능

class Account{
    val name:String
    val birth:String
    var balance:Int
    constructor(name:String,birth:String,balance:Int)
    {
        this.name=name
        this.birth=birth
        if (balance>=0) {
            this.balance = balance
        }
        else {
            this.balance = 0
        }
    }

    fun checkBalance():Int{
        return balance
    }
    fun withdraw(amount:Int):Boolean{
        if (balance>=amount){
            balance-=amount
            return true
        }
        else{
            return false
        }
    }

    fun save(amount: Int){
        balance += amount
    }
}
//개좌 계설하면 1000원을 주는 것.
class Account2(val name: String, val birth: String,var balance: Int=1000){
    fun checkBalance():Int{
        return balance
    }
    fun withdraw(amount:Int):Boolean{
        if (balance>=amount){
            balance-=amount
            return true
        }
        else{
            return false
        }
    }

    fun save(amount: Int){
        balance += amount
    }
}

class Account3(initialBalance: Int){
    val balacne: Int = if(initialBalance>=0) initialBalance else 0

    fun checkBalance():Int{
        return balacne
    }

}

 */