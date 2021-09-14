package com.example.myapplication.Kotlin

//12. 배열

//배열이 필요한 이유
// - 그룹(모음집)이 필요할 때
/*
fun main(array:Array<String>){
    //배열을 생성(*)하는 방법(1)
    var number : Int = 1 //변수를 선언 하는 것
    var group1 = arrayOf<Int>(1,2,3,4,5)
    //(복습요함)
    println(group1 is Array)

    // 배열을 생성하는 방법(2)
    var number1= 10
    //아무런 타입 타 집어 넣을 수 있다.(그러나 비추천 하는 방법!!)
    var group2 = arrayOf(1,2,3.5,"Heloo")


    //Index 란? 순서(번쨰)
    //[1,2,3,4,5]
    //0부터 시작
    //index 0 ->1 ,index 2 ->3
    //배열의 값을 꺼내는 방법(1)-group1.get(index_number)
    val test1=group1.get(0)
    val test2=group1.get(4)
    println(test1)
    println(test2)

    val test3 = group1[0]
    println(test3)

    //배열의 값을 바꾸는 방법(1)-group1.set(index_number,value)
    group1.set(0, 100)
    println(group1[0])

    //배열의 값을 바꾸는 방법(2)-group1[0]=value
    group1[0] = 200
    println(group1[0])


}
*/