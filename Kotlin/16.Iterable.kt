package com.example.myapplication.Kotlin

//16.Iterable
/*
fun main(array: Array<String>){
    val a = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)

    //반복하는 방법(1): for 문
    for (item in a){
        if(item == 5) {
            println("item is Five")
        }
        else{
            println("item is not Five")
        }
    }

    println()
    //(복습요함)
    //반복하는 방법(2)
    for ((index,item) in a.withIndex()) {
        println("Index :" + index + " ,value : "+ item)
        //문자열 + int(정수) = 문자열
        //문자열 + 아무거나 = 문자열
    }

    println()
    //반복하는 방법(3)
    a.forEach{
        println(it)
    }
    println()
    //반복하는 방법(4)
    a.forEach{item ->
        println(item)
    }

    //반복하는 방법(5)
    //(복습요함)
    println()
    a.forEachIndexed { index, item ->
        println("Index:" + index + " ,value :" + item)
    }

    //반복하는 방법(6)
    println(a.size)
    println()
    for(i in 0 until a.size){
        //0 부터 8까지의 인덱스까지 뽑는다. 즉, 마지막 인덱스는 뽑지 않아여.
        println(a.get(i))
    }

    //반복문 사용하는 방법(7)
    println()
    for (i in 0 until a.size step(2)){
        println(a.get(i))
    }

    //반복문 사용하는 방법(8)
    //(복습요함)
    println()
    for (i in a.size -1 downTo(0)){
        println(a.get(i))
    }

    //반복문 사용하는 방법(9)
    println()
    for (i in a.size -1 downTo(0) step(2)){
        println(a.get(i))
    }

    //반복문 사용하는 방법(10)
    println()
    //..은 마지막 포함 until은 마지막 포함하지 않는다.
    for (i in 0..10){
        println(i)
    }

    //반복하는 방법 (11)
    println()
    var b:Int = 0
    var c:Int = 4
    while(b < c){
        b++
        println("b")
    }

    b=0
    c=4
    //반복하는 방법(12)
    println()
    do{
        println("Hello")
        b++
    }while(b<c)



}
*/
