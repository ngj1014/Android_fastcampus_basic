package com.example.myapplication.Kotlin

//27.Interface: 상속이랑  헷갈리지만 편리함을 추구하기 위해서는 반드시 사용할 수 있어야한다.
// - 인터페이스는 약속 ->니가 이것을 구현하면 너도 이 타입이다.
// - 인터페이스는 구현을 반드시 해줘야만한다.
// - 생성자가 없다. -> 인스턴스화 시킬수 없다. -> 설명서가 아니다.
// - 지침서 -> 니가 이것을  구현 하고 싶다면 반드시 아래 기능을 구현해라!
// - 협업할 때 굉장히 편할 수 있다.
// - 상속과 다른점: 상속은 조상을 찾아가는 느낌 , 인터페이스느 종의 특징
/*
fun main(args: Array<String>){
    val student_ : Student_= Student_()
    student_.eat()
    student_.sleep()
}


interface Person_{
    fun eat()
    fun sleep()
}
//우클릭 -> 제너레이트 ->임플리 먼트
class Student_ : Person_{
    override fun eat() {

    }

    override fun sleep() {

    }
}
class SccerPlayer:Person_{
    override fun eat() {

    }

    override fun sleep() {

    }
}

open class Person(){
    open fun eat()
    {

    }

    fun sleep()
    {

    }
}


class Student():Person(){
    override fun eat() {
        super.eat()
    }
}

class Teacher(): Person(){

}
*/
