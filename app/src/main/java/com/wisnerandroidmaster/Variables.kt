package com.wisnerandroidmaster

fun main(){

    showMyname("Wisner")
    showMyAge(20)
    add(18,132)
    println("La resta es ${substract(130,13)} ")
    println("La multi es: ${multiplication(15,15)}")

}

fun showMyname(name: String){
    println("Me llamo $name")
}

fun showMyAge(edad : Int=12){
    println("Tengo $edad anios")
}

fun add(num1: Int, num2:Int){
    println("La suma es ${num1+num2}")
}

fun substract(n1: Int, n2: Int): Int{
    return n1-n2
}

fun multiplication(n1: Int, n2: Int) = n1*n2

fun variables(){
    // escribir en camelcase ejm: "wisnerSama"
    // Varible de lectura

    val pi = 2.1416
    val edad = 145
    val wisner1 = pi.toInt()
    // Variables mutables
    // int,long,Double,Float
    // String,Char, Boolean

    // Constante
    var wisner = "Ernan"
    val jos = 's'

    wisner = "Valdiviezo"

    println(pi+edad)
    println(pi*edad)
    println(wisner1)

    println(wisner+ " "+jos)
}
