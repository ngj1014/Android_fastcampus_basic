package com.example.myapplication.Kotlin

//1)사칙 연산을 수행할 수 있는 클래스

//2)은행 계좌 만들기
// -계좌 생성기능(이름,생년월일)
// - 잔고를 확인하는 기능
// - 출금기능
// - 예금기능

//3)TV 클래스
//         -ON/OFF기능
//         -채널을 돌리는 기능
//         -초기 채널은 (S사 M사 K사 3개)
//1)완료
/*
fun main(array: Array<String>) {
    val fourOperator = four_operator()
    println(fourOperator.plus(4,5))
    println(fourOperator.minus(4,5))
    println(fourOperator.multiply(4,5))
    println(fourOperator.divide(4.0,4.0))
    println(fourOperator.remainder(4,5))

    println()

    val calculator2 =Calculator2()
    println(calculator2.plus(1,2,3,4,5))
    println(calculator2.minus(10,1,2,3,))
    println(calculator2.multiply(1,2,3))
    println(calculator2.divide(10,2,3))

    println()

    val calculator3=Calculator3(3)
    calculator3.plus(5).minus(5)
}
class four_operator{
    fun plus(a:Int,b:Int):Int{
        return a+b
    }
    fun minus(a:Int,b:Int):Int{
        return a-b
    }
    fun multiply(a:Int,b:Int):Int{
        return a*b
    }
    fun divide(a:Double,b:Double):Double{
        return a/b
    }
    fun remainder(a:Int,b:Int):Int{
        return a%b
    }
}
class Calculator2() {
    fun plus(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {
            result = result + it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        for (i in 0 until numbers.size) {
            if(i!=0) {
                result = result - numbers[i]
            }
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            if (it != 0) {
                result = result * it
            }
        }
        return result
    }

    fun divide(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, value ->
            if (index != 0) {
                if (value != 0) {
                    result = result / value
                }
            }
        }
        return result
    }
}
//changing 기법 이다. 정말 중요하다.(다시 복습해라.)
class Calculator3(val initialvalue:Int) {
    fun plus(number:Int):Calculator3{
        val result=this.initialvalue+number
        return Calculator3(result)
    }

    fun minus(number: Int):Calculator3{
        val result = this.initialvalue-number
        return Calculator3(result)
    }

    fun multiply(number:Int):Calculator3{
        val result = this.initialvalue*number
        return Calculator3(result)
    }
    fun divide(number:Int):Calculator3{
        val result = this.initialvalue/number
        return Calculator3(result)
    }

}

 */




