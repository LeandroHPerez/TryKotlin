package br.edu.ifsp.scl.sdm.trykotlin

fun soma(i: Int, j: Int) = i + j

fun cat(i: String, j: String): String = "${i}${j}"

fun main() {
    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))
}

/*
Exercício: utilizando uma função de alta ordem que receba das funções dadas anterioremente (foo e bar)
a saída deve ser :
        30
        Pedro
*/

fun foo(x: Int, y: Int, f:(Int, Int) -> Int):Int = f(x,y)

fun bar(x: String, y: String, g:(String, String) -> String):String = g(x,y)



fun main() {
    println(xpto(2, 3, ::soma))
    println(xpto("Jo", "ão", ::cat))
}

/*
Exercício: utilizando uma função de alta ordem que receba das funções dadas anterioremente (foo e bar)
a saída deve ser :
        5
        João
*/


fun <T,U> xpto(x: T, y: U, f:(T, U) -> T): T = f(x,y)

fun bar (x: String, y: Int): String = "${x}${y}"

xpto("Pedro", 36, ::bar)














//Funções de alta ordem
fun processaInteiro(i: Int, f: (Int) -> Int): Int{
    return f(i)
}

fun processaInteiros(i: Int, j: Int,  f: (Int, Int) -> Int): Int{
    return f(i, j)
}


//funções
fun soma(i: Int, j: Int): Int{
    return i + j
}

fun multiplica(i: Int, j: Int): Int{
    return i * j
}


fun raizQuadrada(numero: Int): Int{
    for (n in 1..numero){
        if (n * n == numero)
            return n
    }
    return -1
}

fun main() {
    //1. Chamadas do primeiro passo
    println(processaInteiros(10, 20, ::soma))
    println(processaInteiros(10, 20, ::multiplica))
    println(processaInteiro(16,  ::raizQuadrada))

    //2. Chamadas do segundo
    println(processaInteiros(10, 20, ::multiplica))

    println(processaInteiros(10, 20, ::multiplica))
}











