package com.example.myapplication.Kotlin

//11. 제어흐름 실습
/*
fun main(args: Array<String>){
    val value:Int? =null

    when(value){
        null->println("Value is null")
    }
    val value2:Boolean? = null
    //when 구문은 조건으로 갖는 값의 모든 경우에 대응 해주는 것이 좋다.
    when(value2){
        true-> println("1")
        false-> println("3")
        null-> println("5")
    }
    //값을 리턴해주는 when 구문의 경우 반드시 값을 리턴해야한다.
    val value3= when(value2){
        true ->1
        false ->3
        null ->5
    }
    println(value3)

    //(복습요함)
    val value4: Int =10
    when (value4){
        //value4가 int 형인가?
        is Int ->println("value4 is int")
        else -> println("value4 is not int")
    }

    //when 의 다양한 조건식(2)
    //시작값은 포함하지만 끝 값은 포함하지 않는다.
    val value5: Int = 70
    when (value5){
        in 60..70 ->println("value is in 60-70")
        in 70..80 ->println("value is in 70-80")
        in 80..90 ->println("value is in 80-90")
    }
}

 */
