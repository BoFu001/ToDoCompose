package com.example.todocompose

fun main() {

    val t = Temperature(35f)
    println(t.tempInFahrenheit)
}

class Temperature(var tempInCelsius: Float)

var Temperature.tempInFahrenheit: Float
    get() = (tempInCelsius * 9 / 5) + 32
    set(value) {
        tempInCelsius = (value - 32) * 5 / 9
    }



