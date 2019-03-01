package br.edu.ifsp.scl.sdm.trykotlin

fun processaInteiro(i: Int, f: (j: Int) -> Int): Int {
    return f(i)
}

fun inverte(x: Int): Int = x * -1

fun Int.executa(f: (I))


fun main(){
    //Passando uma função como um parâmetro
    val n: Int = processaInteiro(10, ::inverte)
    println(n)

    //Passando uma função lambda como parâmetro
    val n2: Int =processaInteiro(11, {x: Int -> -1 * x})
    println(n2)

    //Passando uma função lambda como parâmetro,com mum parâmetro apenas
    val n3: Int = processaInteiro(12, {-1 * it})
    println(n3)

    //Passando uma função lambda como último parâmetro
    val n4: Int = processaInteiro(13)  {-1 * it}
    println(n4)



}