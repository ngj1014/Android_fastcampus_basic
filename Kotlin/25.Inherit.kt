package com.example.myapplication.Kotlin

//두번까지는 봐준다.
//두번 이상이 넘어가면 refactoring해라
//refactoring:정리해라. 정리한 후에도 정상 작동 되어야한다. ->이것을 상속이라한다.

//25. 상속
//부모로 부터 설명서를 물려받는다!
/*
fun main(args:Array<String>){
    val superCar100:SuperCar100= SuperCar100()
    superCar100.drive()
    //superCar100.stop()

    //val bus100:Bus100= Bus100()
    //bus100.drive()

}
//앞에 private안적어도 private 생략된 형태임..(변수에서는 반드시 적어줘야하는 것이다.)\
//부모: Car100 // 자식:SuperCar100,Bus100
open class Car100(){
    //여기에도 private 생략되있는 것
    open fun drive(){
        println("달린다.")
    }
    fun stop(){

    }

}
class SuperCar100():Car100(){
    //마우스 우클릭->제너레이트->오버라이드 메소드
    //부모의 함수를 덮어쓴다.(override)
    //super는 무엇일까?
    override fun drive() {
        //다른 방식이 있다..(상속실습 강의에서7분 39초/10분32초)
        println("빨리 달린다.")
        //super.drive()
    }
}

class Bus100():Car100(){

}

 */