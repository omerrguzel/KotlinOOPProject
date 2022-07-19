package com.oguzel.kotlinoopproject

class User : People{

    //Property
    var name : String? = null
    var age : Int? = null

    //Constructor vs init
    constructor(nameInput:String,ageInput:Int){
        this.name= nameInput
        this.age = ageInput
        println("User created")
        }
    init{
        println("init")
    }
}