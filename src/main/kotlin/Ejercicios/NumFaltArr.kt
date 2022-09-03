package Ejercicios

fun main(){
    val numeros = listOf(10, 12, 14, 15, 16, 18)
    eval(numeros)
    val numeros1 = listOf(1,6,7,10,22,24)
    eval(numeros1)
    val numeros2 = listOf(1,10,2)
    eval(numeros2)
    val numeros3 = listOf(1,1,1,100)
    eval(numeros3)
}
fun eval(numeros: List<Int>){
    if(numeros != numeros.sorted()){
        println("La lista esta desordenada")
    }
    else if(numeros != numeros.distinct()){
        println("La lista tiene numeros repetidos")
    }
    else{
        println("Los numeros que faltan entre el limite inferior (${numeros[0]}) y superior (${numeros[numeros.size-1]}) son: \n"+numFalt(numeros))
    }
}
fun numFalt(numeros: List<Int>): MutableList<Int>{
    val falts = mutableListOf<Int>()
    val largo = numeros.size
    val larg = numeros[numeros.size-1]
    var j = 0
    for (i in numeros[0] .. larg){
        falts.add(i)
    }
    while (j <= largo-1){
        falts.remove(numeros[j])
        j++
    }
    return falts
}

/*
fun numFalt2(numeros: Array<Int>): MutableList<Int>{
    val falts = mutableListOf<Int>()
    val largo = numeros.size
    for (i in numeros[0] .. numeros[largo-1])
        if (!numeros.contains(i)){
            falts.add(i)
        }
    return falts
}*/