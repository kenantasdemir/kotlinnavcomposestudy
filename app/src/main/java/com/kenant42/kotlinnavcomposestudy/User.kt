package com.kenant42.kotlinnavcomposestudy

import java.io.Serializable

data class User(var name:String ="",var age:Int = 0 , var height:Float = 0.0f,var isMarried:Boolean = false):Serializable {
}