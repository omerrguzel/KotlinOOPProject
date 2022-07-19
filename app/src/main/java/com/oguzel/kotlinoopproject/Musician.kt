package com.oguzel.kotlinoopproject

import java.util.*
//open for making class inheritable
open class Musician(name:String, instrument:String, age:Int) {

    //encapsulation

    var name : String? = name
        private set
        get

    private var instrument : String? = instrument

    var age : Int? = age
        private set
        get

    private val bandName : String = "Metallica"

    fun returnBandName(password : String) : String {
        if(password == "Omer") {
            return bandName
        } else {
            return "Wrong password!"
        }

    }

}