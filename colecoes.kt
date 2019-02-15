package br.edu.ifsp.scl.sdm.trykotlin

fun main(args: Array<String>) {

    //List e MutableList
    //listOf é imutável - não aceita remoção nem adição de novos itens, também não aceita uma reatribuição do objeto
    //MutableList é mutável
    var familia: List<String> = listOf<String>("Pedro", "Marcela", "João", "Cadu")
    //familia.add("dog paçoca")  //da erro pq a lista é mutável


    //var lista: MutableList<String>

    familia = listOf<String>()


    //percorrer usando FOR
    for(integrante in familia){
        println(integrante)
    }


    val listaInteiros: List<Int> = listOf<Int>(1,2,3,4,5,6,7,8,9,10)


    for(i in 0..9) {
        println(listaInteiros[i])
    }




}

