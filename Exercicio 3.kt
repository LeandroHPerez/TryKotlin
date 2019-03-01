package br.edu.ifsp.scl.sdm.trykotlin

fun soma(i: Int, j: Int) = i + j

fun cat(i: String, j: String): String = "${i}${j}"

fun main() {
    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))
}

/*
Exercício: a saída deve ser
        30
        Pedro
*/