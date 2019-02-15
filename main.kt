package br.edu.ifsp.scl.sdm.trykotlin

fun main(args: Array<String>) {

    //Declaração de variável mutável
    var frase: String = "Hello, World!"


    println("Hello, world!")

    println(frase)

    println("$frase")
    println("${frase}")

    //Com chamada de função
    println("Quantidade de caracteres: ${frase.count()}")

    //Com propriedade (get)
    println("Quantidade de caracteres: ${frase.length}")


}