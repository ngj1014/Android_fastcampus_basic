package com.example.myapplication.Kotlin

//3)TV 클래스
//         -ON/OFF기능
//         -채널을 돌리는 기능
//         -초기 채널은 (S사 M사 K사 3개)
/*
fun main(args: Array<String>){
    val tv=TV(listOf<String>("K","M","S"))
    tv.switch()
    println(tv.OnOrOff)
    tv.switch()
    println(tv.OnOrOff)

    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.currentChannelNumber


}
class TV(val channels:List<String>){
    var OnOrOff: Boolean = false
    var currentChannelNumber = 0
        //할당 당할때.
        set(value){
            // 무한루프 빠져서 안됨currentChannelNumber=value
            field=value//해결방안.
            println(value)
            if (field>2)
            {
                field=0
            }
            if(field<0)
            {
                field=2
            }
        }
        //불려나갈떄.
        get(){
            println("호출되었습니다.")
            return field + 1
        }
    //값의 할당.
    //a=b
    fun switch(){
        OnOrOff = !OnOrOff
    }
    fun checkCurrentChannel():String{
        return channels[currentChannelNumber]
    }

    fun channelUp(){
        channels.forEachIndexed { index, value ->
            if(currentChannelNumber==index) {
                currentChannelNumber = (currentChannelNumber+1)
                return
            }
        }
    }
    fun channelDown(){
        channels.forEachIndexed { index, value ->
            if(currentChannelNumber==index) {
                currentChannelNumber = (currentChannelNumber-1)
                return
            }
        }
    }
}

 */