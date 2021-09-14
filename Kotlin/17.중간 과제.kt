package com.example.myapplication.Kotlin
/*
fun first() {
    var group= mutableListOf<Int>()
    var group1= mutableListOf<Boolean>()
    for(i in 0 until 9){
        group.add(i,i)
        if(group[i] %2==0)
        {
            group1.add(i,true)
        }
        else
        {
            group1.add(i,false)
        }
    }
    println(group)
    println(group1)
}

fun second(score: Int){
    if (score>=90)
    {
        println("A")
    }
    else if(score>=80)
    {
        println("B")
    }
    else if(score>=70)
    {
        println("C")
    }
    else
    {
        println("F")
    }
}
fun third(Score: Int){
    var count=0
    if(Score<10 || Score>=100)
        println("잘못입력했습니다.")
    else
    {
        count+=(Score/10)
        count+=(Score%10)
    }
    println(count)
}

fun main(array: Array<String>){
    first()
    second(50)
    third(17)
    println()
    for(i in 2 until 10)
    {
        for(j in 1 until 10)
        {
            println("$i x $j = ${i*j}")
        }
        println()
    }
}


 */
//1번 문제
//list 2개를 만든다
//첫번째 list에는 0~9까지 값을 넣는다(반복문사용)
//두번째 list에는 첫번째  list의 값을 하나씩 확인한 후
//짝수면 true,홀수면 false를 넣어준다.



//2번문제
//학점을 구하자
//80~89 ->A
//70-79 ->B
//60-69 ->C
//나머지 F

//3번문제
//전달받은 숫자의 각 자리 숫자의 합을 구하자
//조건: 전달 받은 숫자는 무조건 두자리 숫자이다

//4번
//구구단을 출력하자