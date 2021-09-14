package com.example.myapplication.Kotlin

//과제
//Night,Monster(부모)
//SuperNight,SuperMonster(자식)
//상속이용해서 공격 방어 배우기..

/*
fun main(array:Array<String>){
    val monster=SuperMonster(100,10)
    val night=SuperNight(130,8)
    monster.attack(night)
    monster.bite(night)


}
// 상속이 만들어낸 특징
// - 자식 클래스는 부모 클래스의 타입이다.
// 역은 성립 x      ->ex)슈퍼차는 차이다.    차는 슈퍼카이다(x)
// 자식 클래스는 부모 클래스의 타입이다.
// 부모 클래스는 자식 클래스의 타입은 아니다.
open class Charactor(var hp:Int,val power:Int){
    fun attack(charactor: Charactor,power: Int=this.power){
        charactor.defense(power)
    }
    open fun defense(damage:Int){
        hp-=damage
        if(hp>0)println("${javaClass.simpleName}남은 체력 $hp")
        else println("사망 했습니다.")
    }
}

//자식 클래스가 인스턴스화 되기 위해서 부모 클래스가 선행되서 인스턴스화 되어야한다.
class SuperNight(hp: Int,power: Int):Charactor(hp, power){
    val defensePower = 2
    override fun defense(damage: Int) {
        super.defense(damage-defensePower)
    }
}
//부모생성자로 부터 받은놈은 var or val 적지마세용, 받지않은놈은 적어요.. 안적어도 에러는 안뜨지만 적어라..
class SuperMonster(hp:Int,power: Int):Charactor(hp, power){
    fun bite(charactor: Charactor){
        super.attack(charactor,power+2)
    }
}
*/

