package com.example.myapplication.Kotlin

//18.Class -> 반드시 이해하고 넘어가자....

//OPP ->Object Oriented Programming(객체지향 프로그래밍)

//객체란 무엇일까?

//-이름이 있는 모든 것

//절차지향 프로그래밍: 코드를 위에서 부터 아래로 실행을 하면 문제가 해결된다.

//객체지향 프로그래밍: 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다.

//선수, 심판, 경기장, 관중 ->축구 게임

//객체를 만드는 방법
// -설명서가 있어야 한다.
// -설명서를 어떻게 만드는지 이해해야함.
//
/*
fun main(array:Array<String>){
    //클래스 이용해서 객체 생성
    //->instance(객체)라고 한다. // 아래가 인스턴스화 한 것 이다.
    car("v8 engine","big")

    val bigcar = car("v8 engine","big")
    var bigcar2: car=car("v8 engine","big")

    val number: Int = 10
    val number2 = 20

    val supercar: supercar = supercar("good engine","big","white")

    val runablecar:runablecar= runablecar("simple engine","short body")
    runablecar.ride()
    runablecar.drive()
    runablecar.navi("연천")

    val runablecar2:runablecar2= runablecar2("nice engine","long body")
    println(runablecar2.body)
    println(runablecar2.engine)

    val testclass=testclass()
    testclass.test(1)
    testclass.test(1,2)


}

//클래스(설명서) 만드는 방법(1)
class car (var engine:String,var body: String){

}

//클래스(설명서) 만드는 방법(2)
class supercar{
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body:String,door:String){
        this.engine= engine
        this.body = body
        this.door = door
    }
}

//클래스(설명서) 만드는 방법(3) -> 1번방법의 확장 // 반드시 필요한 부품만 적어낸다.
class car1 constructor(engine:String, body:String){
    var door : String=""

    //생성자(반드시 있어도 되고 추가로 들어가도 되는부분)
    constructor(engine:String,body:String,door:String):this(engine,body){
        this.door= door
    }
}

class car2{
    var engine: String=""
    var body: String=""
    var door: String=""
    constructor(engine:String,body:String){
        this.engine=engine
        this.body=body
    }
    constructor(engine:String,body:String,door:String){
        this.engine=engine
        this.body=body
        this.door=door
    }
}
class runablecar(engine:String,body:String){

    fun ride(){
        println("탑승하였습니다.")
    }
    fun drive(){
        println("달리자~")
    }
    fun navi(destination:String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

//위에 식이랑 완전히 이해 안가면 stop해야한다.
class runablecar2{
    var engine: String
    var body:String

    constructor(engine:String,body:String){
        this.engine=engine
        this.body=body
    }
    //무조건 호출
    init{
        //초기 세팅을 할때 유용
        println("Runablecar2가 만들어 졌어")
    }

    fun ride(){
        println("탑승하였습니다.")
    }
    fun drive(){
        println("달립니다.")
    }
    fun navi(destination: String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}
class testclass(){
    fun test(a:Int){
        println("UP")
    }
    fun test(a:Int,b:Int){
        println("DOWN")
    }
}*/